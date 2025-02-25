package com.google.watcher.v1;

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
 * The service that a client uses to connect to the watcher system.
 * The errors returned by the service are in the canonical error space,
 * see [google.rpc.Code][].
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/watcher/v1/watch.proto")
public final class WatcherGrpc {

  private WatcherGrpc() {}

  public static final String SERVICE_NAME = "google.watcher.v1.Watcher";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.watcher.v1.Request,
      com.google.watcher.v1.ChangeBatch> getWatchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Watch",
      requestType = com.google.watcher.v1.Request.class,
      responseType = com.google.watcher.v1.ChangeBatch.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.watcher.v1.Request,
      com.google.watcher.v1.ChangeBatch> getWatchMethod() {
    io.grpc.MethodDescriptor<com.google.watcher.v1.Request, com.google.watcher.v1.ChangeBatch> getWatchMethod;
    if ((getWatchMethod = WatcherGrpc.getWatchMethod) == null) {
      synchronized (WatcherGrpc.class) {
        if ((getWatchMethod = WatcherGrpc.getWatchMethod) == null) {
          WatcherGrpc.getWatchMethod = getWatchMethod =
              io.grpc.MethodDescriptor.<com.google.watcher.v1.Request, com.google.watcher.v1.ChangeBatch>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Watch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.watcher.v1.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.watcher.v1.ChangeBatch.getDefaultInstance()))
              .setSchemaDescriptor(new WatcherMethodDescriptorSupplier("Watch"))
              .build();
        }
      }
    }
    return getWatchMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WatcherStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WatcherStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WatcherStub>() {
        @java.lang.Override
        public WatcherStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WatcherStub(channel, callOptions);
        }
      };
    return WatcherStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WatcherBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WatcherBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WatcherBlockingStub>() {
        @java.lang.Override
        public WatcherBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WatcherBlockingStub(channel, callOptions);
        }
      };
    return WatcherBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WatcherFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WatcherFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WatcherFutureStub>() {
        @java.lang.Override
        public WatcherFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WatcherFutureStub(channel, callOptions);
        }
      };
    return WatcherFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The service that a client uses to connect to the watcher system.
   * The errors returned by the service are in the canonical error space,
   * see [google.rpc.Code][].
   * </pre>
   */
  public static abstract class WatcherImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Start a streaming RPC to get watch information from the server.
     * </pre>
     */
    public void watch(com.google.watcher.v1.Request request,
        io.grpc.stub.StreamObserver<com.google.watcher.v1.ChangeBatch> responseObserver) {
      asyncUnimplementedUnaryCall(getWatchMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getWatchMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.google.watcher.v1.Request,
                com.google.watcher.v1.ChangeBatch>(
                  this, METHODID_WATCH)))
          .build();
    }
  }

  /**
   * <pre>
   * The service that a client uses to connect to the watcher system.
   * The errors returned by the service are in the canonical error space,
   * see [google.rpc.Code][].
   * </pre>
   */
  public static final class WatcherStub extends io.grpc.stub.AbstractAsyncStub<WatcherStub> {
    private WatcherStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WatcherStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WatcherStub(channel, callOptions);
    }

    /**
     * <pre>
     * Start a streaming RPC to get watch information from the server.
     * </pre>
     */
    public void watch(com.google.watcher.v1.Request request,
        io.grpc.stub.StreamObserver<com.google.watcher.v1.ChangeBatch> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getWatchMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The service that a client uses to connect to the watcher system.
   * The errors returned by the service are in the canonical error space,
   * see [google.rpc.Code][].
   * </pre>
   */
  public static final class WatcherBlockingStub extends io.grpc.stub.AbstractBlockingStub<WatcherBlockingStub> {
    private WatcherBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WatcherBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WatcherBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Start a streaming RPC to get watch information from the server.
     * </pre>
     */
    public java.util.Iterator<com.google.watcher.v1.ChangeBatch> watch(
        com.google.watcher.v1.Request request) {
      return blockingServerStreamingCall(
          getChannel(), getWatchMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The service that a client uses to connect to the watcher system.
   * The errors returned by the service are in the canonical error space,
   * see [google.rpc.Code][].
   * </pre>
   */
  public static final class WatcherFutureStub extends io.grpc.stub.AbstractFutureStub<WatcherFutureStub> {
    private WatcherFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WatcherFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WatcherFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_WATCH = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final WatcherImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WatcherImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_WATCH:
          serviceImpl.watch((com.google.watcher.v1.Request) request,
              (io.grpc.stub.StreamObserver<com.google.watcher.v1.ChangeBatch>) responseObserver);
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

  private static abstract class WatcherBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WatcherBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.watcher.v1.WatchProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Watcher");
    }
  }

  private static final class WatcherFileDescriptorSupplier
      extends WatcherBaseDescriptorSupplier {
    WatcherFileDescriptorSupplier() {}
  }

  private static final class WatcherMethodDescriptorSupplier
      extends WatcherBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WatcherMethodDescriptorSupplier(String methodName) {
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
      synchronized (WatcherGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WatcherFileDescriptorSupplier())
              .addMethod(getWatchMethod())
              .build();
        }
      }
    }
    return result;
  }
}
