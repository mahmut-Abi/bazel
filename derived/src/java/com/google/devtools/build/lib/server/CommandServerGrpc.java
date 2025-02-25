package com.google.devtools.build.lib.server;

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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: src/main/protobuf/command_server.proto")
public final class CommandServerGrpc {

  private CommandServerGrpc() {}

  public static final String SERVICE_NAME = "command_server.CommandServer";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.devtools.build.lib.server.CommandProtos.RunRequest,
      com.google.devtools.build.lib.server.CommandProtos.RunResponse> getRunMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Run",
      requestType = com.google.devtools.build.lib.server.CommandProtos.RunRequest.class,
      responseType = com.google.devtools.build.lib.server.CommandProtos.RunResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.devtools.build.lib.server.CommandProtos.RunRequest,
      com.google.devtools.build.lib.server.CommandProtos.RunResponse> getRunMethod() {
    io.grpc.MethodDescriptor<com.google.devtools.build.lib.server.CommandProtos.RunRequest, com.google.devtools.build.lib.server.CommandProtos.RunResponse> getRunMethod;
    if ((getRunMethod = CommandServerGrpc.getRunMethod) == null) {
      synchronized (CommandServerGrpc.class) {
        if ((getRunMethod = CommandServerGrpc.getRunMethod) == null) {
          CommandServerGrpc.getRunMethod = getRunMethod =
              io.grpc.MethodDescriptor.<com.google.devtools.build.lib.server.CommandProtos.RunRequest, com.google.devtools.build.lib.server.CommandProtos.RunResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Run"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.devtools.build.lib.server.CommandProtos.RunRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.devtools.build.lib.server.CommandProtos.RunResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CommandServerMethodDescriptorSupplier("Run"))
              .build();
        }
      }
    }
    return getRunMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.devtools.build.lib.server.CommandProtos.CancelRequest,
      com.google.devtools.build.lib.server.CommandProtos.CancelResponse> getCancelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Cancel",
      requestType = com.google.devtools.build.lib.server.CommandProtos.CancelRequest.class,
      responseType = com.google.devtools.build.lib.server.CommandProtos.CancelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.devtools.build.lib.server.CommandProtos.CancelRequest,
      com.google.devtools.build.lib.server.CommandProtos.CancelResponse> getCancelMethod() {
    io.grpc.MethodDescriptor<com.google.devtools.build.lib.server.CommandProtos.CancelRequest, com.google.devtools.build.lib.server.CommandProtos.CancelResponse> getCancelMethod;
    if ((getCancelMethod = CommandServerGrpc.getCancelMethod) == null) {
      synchronized (CommandServerGrpc.class) {
        if ((getCancelMethod = CommandServerGrpc.getCancelMethod) == null) {
          CommandServerGrpc.getCancelMethod = getCancelMethod =
              io.grpc.MethodDescriptor.<com.google.devtools.build.lib.server.CommandProtos.CancelRequest, com.google.devtools.build.lib.server.CommandProtos.CancelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Cancel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.devtools.build.lib.server.CommandProtos.CancelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.devtools.build.lib.server.CommandProtos.CancelResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CommandServerMethodDescriptorSupplier("Cancel"))
              .build();
        }
      }
    }
    return getCancelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.devtools.build.lib.server.CommandProtos.PingRequest,
      com.google.devtools.build.lib.server.CommandProtos.PingResponse> getPingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Ping",
      requestType = com.google.devtools.build.lib.server.CommandProtos.PingRequest.class,
      responseType = com.google.devtools.build.lib.server.CommandProtos.PingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.devtools.build.lib.server.CommandProtos.PingRequest,
      com.google.devtools.build.lib.server.CommandProtos.PingResponse> getPingMethod() {
    io.grpc.MethodDescriptor<com.google.devtools.build.lib.server.CommandProtos.PingRequest, com.google.devtools.build.lib.server.CommandProtos.PingResponse> getPingMethod;
    if ((getPingMethod = CommandServerGrpc.getPingMethod) == null) {
      synchronized (CommandServerGrpc.class) {
        if ((getPingMethod = CommandServerGrpc.getPingMethod) == null) {
          CommandServerGrpc.getPingMethod = getPingMethod =
              io.grpc.MethodDescriptor.<com.google.devtools.build.lib.server.CommandProtos.PingRequest, com.google.devtools.build.lib.server.CommandProtos.PingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Ping"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.devtools.build.lib.server.CommandProtos.PingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.devtools.build.lib.server.CommandProtos.PingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CommandServerMethodDescriptorSupplier("Ping"))
              .build();
        }
      }
    }
    return getPingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CommandServerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CommandServerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CommandServerStub>() {
        @java.lang.Override
        public CommandServerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CommandServerStub(channel, callOptions);
        }
      };
    return CommandServerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CommandServerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CommandServerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CommandServerBlockingStub>() {
        @java.lang.Override
        public CommandServerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CommandServerBlockingStub(channel, callOptions);
        }
      };
    return CommandServerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CommandServerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CommandServerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CommandServerFutureStub>() {
        @java.lang.Override
        public CommandServerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CommandServerFutureStub(channel, callOptions);
        }
      };
    return CommandServerFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CommandServerImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Run a Bazel command. See documentation of argument/return messages for
     * details.
     * </pre>
     */
    public void run(com.google.devtools.build.lib.server.CommandProtos.RunRequest request,
        io.grpc.stub.StreamObserver<com.google.devtools.build.lib.server.CommandProtos.RunResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRunMethod(), responseObserver);
    }

    /**
     * <pre>
     * Cancel a currently running Bazel command. May return before the run command
     * actually terminates.
     * </pre>
     */
    public void cancel(com.google.devtools.build.lib.server.CommandProtos.CancelRequest request,
        io.grpc.stub.StreamObserver<com.google.devtools.build.lib.server.CommandProtos.CancelResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCancelMethod(), responseObserver);
    }

    /**
     * <pre>
     * Does not do anything. Used for liveness check.
     * </pre>
     */
    public void ping(com.google.devtools.build.lib.server.CommandProtos.PingRequest request,
        io.grpc.stub.StreamObserver<com.google.devtools.build.lib.server.CommandProtos.PingResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRunMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.google.devtools.build.lib.server.CommandProtos.RunRequest,
                com.google.devtools.build.lib.server.CommandProtos.RunResponse>(
                  this, METHODID_RUN)))
          .addMethod(
            getCancelMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.devtools.build.lib.server.CommandProtos.CancelRequest,
                com.google.devtools.build.lib.server.CommandProtos.CancelResponse>(
                  this, METHODID_CANCEL)))
          .addMethod(
            getPingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.devtools.build.lib.server.CommandProtos.PingRequest,
                com.google.devtools.build.lib.server.CommandProtos.PingResponse>(
                  this, METHODID_PING)))
          .build();
    }
  }

  /**
   */
  public static final class CommandServerStub extends io.grpc.stub.AbstractAsyncStub<CommandServerStub> {
    private CommandServerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommandServerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CommandServerStub(channel, callOptions);
    }

    /**
     * <pre>
     * Run a Bazel command. See documentation of argument/return messages for
     * details.
     * </pre>
     */
    public void run(com.google.devtools.build.lib.server.CommandProtos.RunRequest request,
        io.grpc.stub.StreamObserver<com.google.devtools.build.lib.server.CommandProtos.RunResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getRunMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Cancel a currently running Bazel command. May return before the run command
     * actually terminates.
     * </pre>
     */
    public void cancel(com.google.devtools.build.lib.server.CommandProtos.CancelRequest request,
        io.grpc.stub.StreamObserver<com.google.devtools.build.lib.server.CommandProtos.CancelResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCancelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Does not do anything. Used for liveness check.
     * </pre>
     */
    public void ping(com.google.devtools.build.lib.server.CommandProtos.PingRequest request,
        io.grpc.stub.StreamObserver<com.google.devtools.build.lib.server.CommandProtos.PingResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CommandServerBlockingStub extends io.grpc.stub.AbstractBlockingStub<CommandServerBlockingStub> {
    private CommandServerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommandServerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CommandServerBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Run a Bazel command. See documentation of argument/return messages for
     * details.
     * </pre>
     */
    public java.util.Iterator<com.google.devtools.build.lib.server.CommandProtos.RunResponse> run(
        com.google.devtools.build.lib.server.CommandProtos.RunRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getRunMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Cancel a currently running Bazel command. May return before the run command
     * actually terminates.
     * </pre>
     */
    public com.google.devtools.build.lib.server.CommandProtos.CancelResponse cancel(com.google.devtools.build.lib.server.CommandProtos.CancelRequest request) {
      return blockingUnaryCall(
          getChannel(), getCancelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Does not do anything. Used for liveness check.
     * </pre>
     */
    public com.google.devtools.build.lib.server.CommandProtos.PingResponse ping(com.google.devtools.build.lib.server.CommandProtos.PingRequest request) {
      return blockingUnaryCall(
          getChannel(), getPingMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CommandServerFutureStub extends io.grpc.stub.AbstractFutureStub<CommandServerFutureStub> {
    private CommandServerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommandServerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CommandServerFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Cancel a currently running Bazel command. May return before the run command
     * actually terminates.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.devtools.build.lib.server.CommandProtos.CancelResponse> cancel(
        com.google.devtools.build.lib.server.CommandProtos.CancelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCancelMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Does not do anything. Used for liveness check.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.devtools.build.lib.server.CommandProtos.PingResponse> ping(
        com.google.devtools.build.lib.server.CommandProtos.PingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RUN = 0;
  private static final int METHODID_CANCEL = 1;
  private static final int METHODID_PING = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CommandServerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CommandServerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RUN:
          serviceImpl.run((com.google.devtools.build.lib.server.CommandProtos.RunRequest) request,
              (io.grpc.stub.StreamObserver<com.google.devtools.build.lib.server.CommandProtos.RunResponse>) responseObserver);
          break;
        case METHODID_CANCEL:
          serviceImpl.cancel((com.google.devtools.build.lib.server.CommandProtos.CancelRequest) request,
              (io.grpc.stub.StreamObserver<com.google.devtools.build.lib.server.CommandProtos.CancelResponse>) responseObserver);
          break;
        case METHODID_PING:
          serviceImpl.ping((com.google.devtools.build.lib.server.CommandProtos.PingRequest) request,
              (io.grpc.stub.StreamObserver<com.google.devtools.build.lib.server.CommandProtos.PingResponse>) responseObserver);
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

  private static abstract class CommandServerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CommandServerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.devtools.build.lib.server.CommandProtos.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CommandServer");
    }
  }

  private static final class CommandServerFileDescriptorSupplier
      extends CommandServerBaseDescriptorSupplier {
    CommandServerFileDescriptorSupplier() {}
  }

  private static final class CommandServerMethodDescriptorSupplier
      extends CommandServerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CommandServerMethodDescriptorSupplier(String methodName) {
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
      synchronized (CommandServerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CommandServerFileDescriptorSupplier())
              .addMethod(getRunMethod())
              .addMethod(getCancelMethod())
              .addMethod(getPingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
