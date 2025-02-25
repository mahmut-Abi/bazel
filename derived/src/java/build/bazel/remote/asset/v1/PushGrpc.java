package build.bazel.remote.asset.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * The Push service is complementary to the Fetch, and allows for
 * associating contents of URLs to be returned in future Fetch API calls.
 * As with other services in the Remote Execution API, any call may return an
 * error with a [RetryInfo][google.rpc.RetryInfo] error detail providing
 * information about when the client should retry the request; clients SHOULD
 * respect the information provided.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: build/bazel/remote/asset/v1/remote_asset.proto")
public final class PushGrpc {

  private PushGrpc() {}

  public static final String SERVICE_NAME = "build.bazel.remote.asset.v1.Push";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<build.bazel.remote.asset.v1.PushBlobRequest,
      build.bazel.remote.asset.v1.PushBlobResponse> getPushBlobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PushBlob",
      requestType = build.bazel.remote.asset.v1.PushBlobRequest.class,
      responseType = build.bazel.remote.asset.v1.PushBlobResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<build.bazel.remote.asset.v1.PushBlobRequest,
      build.bazel.remote.asset.v1.PushBlobResponse> getPushBlobMethod() {
    io.grpc.MethodDescriptor<build.bazel.remote.asset.v1.PushBlobRequest, build.bazel.remote.asset.v1.PushBlobResponse> getPushBlobMethod;
    if ((getPushBlobMethod = PushGrpc.getPushBlobMethod) == null) {
      synchronized (PushGrpc.class) {
        if ((getPushBlobMethod = PushGrpc.getPushBlobMethod) == null) {
          PushGrpc.getPushBlobMethod = getPushBlobMethod =
              io.grpc.MethodDescriptor.<build.bazel.remote.asset.v1.PushBlobRequest, build.bazel.remote.asset.v1.PushBlobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PushBlob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  build.bazel.remote.asset.v1.PushBlobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  build.bazel.remote.asset.v1.PushBlobResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PushMethodDescriptorSupplier("PushBlob"))
              .build();
        }
      }
    }
    return getPushBlobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<build.bazel.remote.asset.v1.PushDirectoryRequest,
      build.bazel.remote.asset.v1.PushDirectoryResponse> getPushDirectoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PushDirectory",
      requestType = build.bazel.remote.asset.v1.PushDirectoryRequest.class,
      responseType = build.bazel.remote.asset.v1.PushDirectoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<build.bazel.remote.asset.v1.PushDirectoryRequest,
      build.bazel.remote.asset.v1.PushDirectoryResponse> getPushDirectoryMethod() {
    io.grpc.MethodDescriptor<build.bazel.remote.asset.v1.PushDirectoryRequest, build.bazel.remote.asset.v1.PushDirectoryResponse> getPushDirectoryMethod;
    if ((getPushDirectoryMethod = PushGrpc.getPushDirectoryMethod) == null) {
      synchronized (PushGrpc.class) {
        if ((getPushDirectoryMethod = PushGrpc.getPushDirectoryMethod) == null) {
          PushGrpc.getPushDirectoryMethod = getPushDirectoryMethod =
              io.grpc.MethodDescriptor.<build.bazel.remote.asset.v1.PushDirectoryRequest, build.bazel.remote.asset.v1.PushDirectoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PushDirectory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  build.bazel.remote.asset.v1.PushDirectoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  build.bazel.remote.asset.v1.PushDirectoryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PushMethodDescriptorSupplier("PushDirectory"))
              .build();
        }
      }
    }
    return getPushDirectoryMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PushStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PushStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PushStub>() {
        @java.lang.Override
        public PushStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PushStub(channel, callOptions);
        }
      };
    return PushStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PushBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PushBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PushBlockingStub>() {
        @java.lang.Override
        public PushBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PushBlockingStub(channel, callOptions);
        }
      };
    return PushBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PushFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PushFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PushFutureStub>() {
        @java.lang.Override
        public PushFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PushFutureStub(channel, callOptions);
        }
      };
    return PushFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The Push service is complementary to the Fetch, and allows for
   * associating contents of URLs to be returned in future Fetch API calls.
   * As with other services in the Remote Execution API, any call may return an
   * error with a [RetryInfo][google.rpc.RetryInfo] error detail providing
   * information about when the client should retry the request; clients SHOULD
   * respect the information provided.
   * </pre>
   */
  public static abstract class PushImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * These APIs associate the identifying information of a resource, as
     * indicated by URI and optionally Qualifiers, with content available in the
     * CAS. For example, associating a repository url and a commit id with a
     * Directory Digest.
     * Servers *SHOULD* only allow trusted clients to associate content, and *MAY*
     * only allow certain URIs to be pushed.
     * Clients *MUST* ensure associated content is available in CAS prior to
     * pushing.
     * Clients *MUST* ensure the Qualifiers listed correctly match the contents,
     * and Servers *MAY* trust these values without validation.
     * Fetch servers *MAY* require exact match of all qualifiers when returning
     * content previously pushed, or allow fetching content with only a subset of
     * the qualifiers specified on Push.
     * Clients can specify expiration information that the server *SHOULD*
     * respect. Subsequent requests can be used to alter the expiration time.
     * A minimal compliant Fetch implementation may support only Push'd content
     * and return `NOT_FOUND` for any resource that was not pushed first.
     * Alternatively, a compliant implementation may choose to not support Push
     * and only return resources that can be Fetch'd from origin.
     * Errors will be returned as gRPC Status errors.
     * The possible RPC errors include:
     * * `INVALID_ARGUMENT`: One or more arguments to the RPC were invalid.
     * * `RESOURCE_EXHAUSTED`: There is insufficient quota of some resource to
     *   perform the requested operation. The client may retry after a delay.
     * * `UNAVAILABLE`: Due to a transient condition the operation could not be
     *   completed. The client should retry.
     * * `INTERNAL`: An internal error occurred while performing the operation.
     *   The client should retry.
     * </pre>
     */
    public void pushBlob(build.bazel.remote.asset.v1.PushBlobRequest request,
        io.grpc.stub.StreamObserver<build.bazel.remote.asset.v1.PushBlobResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPushBlobMethod(), responseObserver);
    }

    /**
     */
    public void pushDirectory(build.bazel.remote.asset.v1.PushDirectoryRequest request,
        io.grpc.stub.StreamObserver<build.bazel.remote.asset.v1.PushDirectoryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPushDirectoryMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPushBlobMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                build.bazel.remote.asset.v1.PushBlobRequest,
                build.bazel.remote.asset.v1.PushBlobResponse>(
                  this, METHODID_PUSH_BLOB)))
          .addMethod(
            getPushDirectoryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                build.bazel.remote.asset.v1.PushDirectoryRequest,
                build.bazel.remote.asset.v1.PushDirectoryResponse>(
                  this, METHODID_PUSH_DIRECTORY)))
          .build();
    }
  }

  /**
   * <pre>
   * The Push service is complementary to the Fetch, and allows for
   * associating contents of URLs to be returned in future Fetch API calls.
   * As with other services in the Remote Execution API, any call may return an
   * error with a [RetryInfo][google.rpc.RetryInfo] error detail providing
   * information about when the client should retry the request; clients SHOULD
   * respect the information provided.
   * </pre>
   */
  public static final class PushStub extends io.grpc.stub.AbstractAsyncStub<PushStub> {
    private PushStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PushStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PushStub(channel, callOptions);
    }

    /**
     * <pre>
     * These APIs associate the identifying information of a resource, as
     * indicated by URI and optionally Qualifiers, with content available in the
     * CAS. For example, associating a repository url and a commit id with a
     * Directory Digest.
     * Servers *SHOULD* only allow trusted clients to associate content, and *MAY*
     * only allow certain URIs to be pushed.
     * Clients *MUST* ensure associated content is available in CAS prior to
     * pushing.
     * Clients *MUST* ensure the Qualifiers listed correctly match the contents,
     * and Servers *MAY* trust these values without validation.
     * Fetch servers *MAY* require exact match of all qualifiers when returning
     * content previously pushed, or allow fetching content with only a subset of
     * the qualifiers specified on Push.
     * Clients can specify expiration information that the server *SHOULD*
     * respect. Subsequent requests can be used to alter the expiration time.
     * A minimal compliant Fetch implementation may support only Push'd content
     * and return `NOT_FOUND` for any resource that was not pushed first.
     * Alternatively, a compliant implementation may choose to not support Push
     * and only return resources that can be Fetch'd from origin.
     * Errors will be returned as gRPC Status errors.
     * The possible RPC errors include:
     * * `INVALID_ARGUMENT`: One or more arguments to the RPC were invalid.
     * * `RESOURCE_EXHAUSTED`: There is insufficient quota of some resource to
     *   perform the requested operation. The client may retry after a delay.
     * * `UNAVAILABLE`: Due to a transient condition the operation could not be
     *   completed. The client should retry.
     * * `INTERNAL`: An internal error occurred while performing the operation.
     *   The client should retry.
     * </pre>
     */
    public void pushBlob(build.bazel.remote.asset.v1.PushBlobRequest request,
        io.grpc.stub.StreamObserver<build.bazel.remote.asset.v1.PushBlobResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPushBlobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void pushDirectory(build.bazel.remote.asset.v1.PushDirectoryRequest request,
        io.grpc.stub.StreamObserver<build.bazel.remote.asset.v1.PushDirectoryResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPushDirectoryMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The Push service is complementary to the Fetch, and allows for
   * associating contents of URLs to be returned in future Fetch API calls.
   * As with other services in the Remote Execution API, any call may return an
   * error with a [RetryInfo][google.rpc.RetryInfo] error detail providing
   * information about when the client should retry the request; clients SHOULD
   * respect the information provided.
   * </pre>
   */
  public static final class PushBlockingStub extends io.grpc.stub.AbstractBlockingStub<PushBlockingStub> {
    private PushBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PushBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PushBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * These APIs associate the identifying information of a resource, as
     * indicated by URI and optionally Qualifiers, with content available in the
     * CAS. For example, associating a repository url and a commit id with a
     * Directory Digest.
     * Servers *SHOULD* only allow trusted clients to associate content, and *MAY*
     * only allow certain URIs to be pushed.
     * Clients *MUST* ensure associated content is available in CAS prior to
     * pushing.
     * Clients *MUST* ensure the Qualifiers listed correctly match the contents,
     * and Servers *MAY* trust these values without validation.
     * Fetch servers *MAY* require exact match of all qualifiers when returning
     * content previously pushed, or allow fetching content with only a subset of
     * the qualifiers specified on Push.
     * Clients can specify expiration information that the server *SHOULD*
     * respect. Subsequent requests can be used to alter the expiration time.
     * A minimal compliant Fetch implementation may support only Push'd content
     * and return `NOT_FOUND` for any resource that was not pushed first.
     * Alternatively, a compliant implementation may choose to not support Push
     * and only return resources that can be Fetch'd from origin.
     * Errors will be returned as gRPC Status errors.
     * The possible RPC errors include:
     * * `INVALID_ARGUMENT`: One or more arguments to the RPC were invalid.
     * * `RESOURCE_EXHAUSTED`: There is insufficient quota of some resource to
     *   perform the requested operation. The client may retry after a delay.
     * * `UNAVAILABLE`: Due to a transient condition the operation could not be
     *   completed. The client should retry.
     * * `INTERNAL`: An internal error occurred while performing the operation.
     *   The client should retry.
     * </pre>
     */
    public build.bazel.remote.asset.v1.PushBlobResponse pushBlob(build.bazel.remote.asset.v1.PushBlobRequest request) {
      return blockingUnaryCall(
          getChannel(), getPushBlobMethod(), getCallOptions(), request);
    }

    /**
     */
    public build.bazel.remote.asset.v1.PushDirectoryResponse pushDirectory(build.bazel.remote.asset.v1.PushDirectoryRequest request) {
      return blockingUnaryCall(
          getChannel(), getPushDirectoryMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The Push service is complementary to the Fetch, and allows for
   * associating contents of URLs to be returned in future Fetch API calls.
   * As with other services in the Remote Execution API, any call may return an
   * error with a [RetryInfo][google.rpc.RetryInfo] error detail providing
   * information about when the client should retry the request; clients SHOULD
   * respect the information provided.
   * </pre>
   */
  public static final class PushFutureStub extends io.grpc.stub.AbstractFutureStub<PushFutureStub> {
    private PushFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PushFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PushFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * These APIs associate the identifying information of a resource, as
     * indicated by URI and optionally Qualifiers, with content available in the
     * CAS. For example, associating a repository url and a commit id with a
     * Directory Digest.
     * Servers *SHOULD* only allow trusted clients to associate content, and *MAY*
     * only allow certain URIs to be pushed.
     * Clients *MUST* ensure associated content is available in CAS prior to
     * pushing.
     * Clients *MUST* ensure the Qualifiers listed correctly match the contents,
     * and Servers *MAY* trust these values without validation.
     * Fetch servers *MAY* require exact match of all qualifiers when returning
     * content previously pushed, or allow fetching content with only a subset of
     * the qualifiers specified on Push.
     * Clients can specify expiration information that the server *SHOULD*
     * respect. Subsequent requests can be used to alter the expiration time.
     * A minimal compliant Fetch implementation may support only Push'd content
     * and return `NOT_FOUND` for any resource that was not pushed first.
     * Alternatively, a compliant implementation may choose to not support Push
     * and only return resources that can be Fetch'd from origin.
     * Errors will be returned as gRPC Status errors.
     * The possible RPC errors include:
     * * `INVALID_ARGUMENT`: One or more arguments to the RPC were invalid.
     * * `RESOURCE_EXHAUSTED`: There is insufficient quota of some resource to
     *   perform the requested operation. The client may retry after a delay.
     * * `UNAVAILABLE`: Due to a transient condition the operation could not be
     *   completed. The client should retry.
     * * `INTERNAL`: An internal error occurred while performing the operation.
     *   The client should retry.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<build.bazel.remote.asset.v1.PushBlobResponse> pushBlob(
        build.bazel.remote.asset.v1.PushBlobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPushBlobMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<build.bazel.remote.asset.v1.PushDirectoryResponse> pushDirectory(
        build.bazel.remote.asset.v1.PushDirectoryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPushDirectoryMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PUSH_BLOB = 0;
  private static final int METHODID_PUSH_DIRECTORY = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PushImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PushImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PUSH_BLOB:
          serviceImpl.pushBlob((build.bazel.remote.asset.v1.PushBlobRequest) request,
              (io.grpc.stub.StreamObserver<build.bazel.remote.asset.v1.PushBlobResponse>) responseObserver);
          break;
        case METHODID_PUSH_DIRECTORY:
          serviceImpl.pushDirectory((build.bazel.remote.asset.v1.PushDirectoryRequest) request,
              (io.grpc.stub.StreamObserver<build.bazel.remote.asset.v1.PushDirectoryResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class PushBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PushBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return build.bazel.remote.asset.v1.RemoteAssetProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Push");
    }
  }

  private static final class PushFileDescriptorSupplier
      extends PushBaseDescriptorSupplier {
    PushFileDescriptorSupplier() {}
  }

  private static final class PushMethodDescriptorSupplier
      extends PushBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PushMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PushGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PushFileDescriptorSupplier())
              .addMethod(getPushBlobMethod())
              .addMethod(getPushDirectoryMethod())
              .build();
        }
      }
    }
    return result;
  }
}
