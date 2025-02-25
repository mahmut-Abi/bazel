// Copyright 2022 The Bazel Authors. All rights reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

#include <unistd.h>
#include <limits.h>
#include <sys/auxv.h>

#include "src/main/cpp/blaze_util_platform.h"
#include "src/main/cpp/startup_options.h"
#include "src/main/cpp/util/errors.h"
#include "src/main/cpp/util/exit_code.h"
#include "src/main/cpp/util/logging.h"

namespace blaze {

using blaze_util::GetLastErrorString;
using std::string;

string GetSelfPath(const char* argv0, const StartupOptions &options) {
  // Sometimes /proc/self/exec isn't valid (binfmt_misc + qemu)
  // so we provide an alternate API. e.g. Linux aarch64 running
  // bazel-x86_64-linux
  if (options.linux_bazel_path_from_getauxval) {
    return reinterpret_cast<const char *>(getauxval(AT_EXECFN));
  }

  char buffer[PATH_MAX] = {};
  ssize_t bytes = readlink("/proc/self/exe", buffer, sizeof(buffer));
  if (bytes == sizeof(buffer)) {
    // symlink contents truncated
    bytes = -1;
    errno = ENAMETOOLONG;
  }
  if (bytes == -1) {
    BAZEL_DIE(blaze_exit_code::INTERNAL_ERROR)
        << "error reading /proc/self/exe: " << GetLastErrorString();
  }
  buffer[bytes] = '\0';  // readlink does not NUL-terminate
  return string(buffer);
}

}  // namespace blaze
