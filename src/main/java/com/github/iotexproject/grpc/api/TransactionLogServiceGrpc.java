package com.github.iotexproject.grpc.api;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * experiment
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.69.0)",
    comments = "Source: proto/api/api.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TransactionLogServiceGrpc {

  private TransactionLogServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "iotexapi.TransactionLogService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.GetTransactionLogByActionHashRequest,
      com.github.iotexproject.grpc.api.GetTransactionLogByActionHashResponse> getGetTransactionLogByActionHashMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransactionLogByActionHash",
      requestType = com.github.iotexproject.grpc.api.GetTransactionLogByActionHashRequest.class,
      responseType = com.github.iotexproject.grpc.api.GetTransactionLogByActionHashResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.GetTransactionLogByActionHashRequest,
      com.github.iotexproject.grpc.api.GetTransactionLogByActionHashResponse> getGetTransactionLogByActionHashMethod() {
    io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.GetTransactionLogByActionHashRequest, com.github.iotexproject.grpc.api.GetTransactionLogByActionHashResponse> getGetTransactionLogByActionHashMethod;
    if ((getGetTransactionLogByActionHashMethod = TransactionLogServiceGrpc.getGetTransactionLogByActionHashMethod) == null) {
      synchronized (TransactionLogServiceGrpc.class) {
        if ((getGetTransactionLogByActionHashMethod = TransactionLogServiceGrpc.getGetTransactionLogByActionHashMethod) == null) {
          TransactionLogServiceGrpc.getGetTransactionLogByActionHashMethod = getGetTransactionLogByActionHashMethod =
              io.grpc.MethodDescriptor.<com.github.iotexproject.grpc.api.GetTransactionLogByActionHashRequest, com.github.iotexproject.grpc.api.GetTransactionLogByActionHashResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionLogByActionHash"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.iotexproject.grpc.api.GetTransactionLogByActionHashRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.iotexproject.grpc.api.GetTransactionLogByActionHashResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TransactionLogServiceMethodDescriptorSupplier("GetTransactionLogByActionHash"))
              .build();
        }
      }
    }
    return getGetTransactionLogByActionHashMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.GetTransactionLogByBlockHeightRequest,
      com.github.iotexproject.grpc.api.GetTransactionLogByBlockHeightResponse> getGetTransactionLogByBlockHeightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransactionLogByBlockHeight",
      requestType = com.github.iotexproject.grpc.api.GetTransactionLogByBlockHeightRequest.class,
      responseType = com.github.iotexproject.grpc.api.GetTransactionLogByBlockHeightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.GetTransactionLogByBlockHeightRequest,
      com.github.iotexproject.grpc.api.GetTransactionLogByBlockHeightResponse> getGetTransactionLogByBlockHeightMethod() {
    io.grpc.MethodDescriptor<com.github.iotexproject.grpc.api.GetTransactionLogByBlockHeightRequest, com.github.iotexproject.grpc.api.GetTransactionLogByBlockHeightResponse> getGetTransactionLogByBlockHeightMethod;
    if ((getGetTransactionLogByBlockHeightMethod = TransactionLogServiceGrpc.getGetTransactionLogByBlockHeightMethod) == null) {
      synchronized (TransactionLogServiceGrpc.class) {
        if ((getGetTransactionLogByBlockHeightMethod = TransactionLogServiceGrpc.getGetTransactionLogByBlockHeightMethod) == null) {
          TransactionLogServiceGrpc.getGetTransactionLogByBlockHeightMethod = getGetTransactionLogByBlockHeightMethod =
              io.grpc.MethodDescriptor.<com.github.iotexproject.grpc.api.GetTransactionLogByBlockHeightRequest, com.github.iotexproject.grpc.api.GetTransactionLogByBlockHeightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionLogByBlockHeight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.iotexproject.grpc.api.GetTransactionLogByBlockHeightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.iotexproject.grpc.api.GetTransactionLogByBlockHeightResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TransactionLogServiceMethodDescriptorSupplier("GetTransactionLogByBlockHeight"))
              .build();
        }
      }
    }
    return getGetTransactionLogByBlockHeightMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TransactionLogServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TransactionLogServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TransactionLogServiceStub>() {
        @java.lang.Override
        public TransactionLogServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TransactionLogServiceStub(channel, callOptions);
        }
      };
    return TransactionLogServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TransactionLogServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TransactionLogServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TransactionLogServiceBlockingStub>() {
        @java.lang.Override
        public TransactionLogServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TransactionLogServiceBlockingStub(channel, callOptions);
        }
      };
    return TransactionLogServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TransactionLogServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TransactionLogServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TransactionLogServiceFutureStub>() {
        @java.lang.Override
        public TransactionLogServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TransactionLogServiceFutureStub(channel, callOptions);
        }
      };
    return TransactionLogServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * experiment
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void getTransactionLogByActionHash(com.github.iotexproject.grpc.api.GetTransactionLogByActionHashRequest request,
        io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.GetTransactionLogByActionHashResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTransactionLogByActionHashMethod(), responseObserver);
    }

    /**
     */
    default void getTransactionLogByBlockHeight(com.github.iotexproject.grpc.api.GetTransactionLogByBlockHeightRequest request,
        io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.GetTransactionLogByBlockHeightResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTransactionLogByBlockHeightMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service TransactionLogService.
   * <pre>
   * experiment
   * </pre>
   */
  public static abstract class TransactionLogServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TransactionLogServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service TransactionLogService.
   * <pre>
   * experiment
   * </pre>
   */
  public static final class TransactionLogServiceStub
      extends io.grpc.stub.AbstractAsyncStub<TransactionLogServiceStub> {
    private TransactionLogServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TransactionLogServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TransactionLogServiceStub(channel, callOptions);
    }

    /**
     */
    public void getTransactionLogByActionHash(com.github.iotexproject.grpc.api.GetTransactionLogByActionHashRequest request,
        io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.GetTransactionLogByActionHashResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTransactionLogByActionHashMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransactionLogByBlockHeight(com.github.iotexproject.grpc.api.GetTransactionLogByBlockHeightRequest request,
        io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.GetTransactionLogByBlockHeightResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTransactionLogByBlockHeightMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service TransactionLogService.
   * <pre>
   * experiment
   * </pre>
   */
  public static final class TransactionLogServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TransactionLogServiceBlockingStub> {
    private TransactionLogServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TransactionLogServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TransactionLogServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.github.iotexproject.grpc.api.GetTransactionLogByActionHashResponse getTransactionLogByActionHash(com.github.iotexproject.grpc.api.GetTransactionLogByActionHashRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTransactionLogByActionHashMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.iotexproject.grpc.api.GetTransactionLogByBlockHeightResponse getTransactionLogByBlockHeight(com.github.iotexproject.grpc.api.GetTransactionLogByBlockHeightRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTransactionLogByBlockHeightMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service TransactionLogService.
   * <pre>
   * experiment
   * </pre>
   */
  public static final class TransactionLogServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<TransactionLogServiceFutureStub> {
    private TransactionLogServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TransactionLogServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TransactionLogServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.iotexproject.grpc.api.GetTransactionLogByActionHashResponse> getTransactionLogByActionHash(
        com.github.iotexproject.grpc.api.GetTransactionLogByActionHashRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTransactionLogByActionHashMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.iotexproject.grpc.api.GetTransactionLogByBlockHeightResponse> getTransactionLogByBlockHeight(
        com.github.iotexproject.grpc.api.GetTransactionLogByBlockHeightRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTransactionLogByBlockHeightMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_TRANSACTION_LOG_BY_ACTION_HASH = 0;
  private static final int METHODID_GET_TRANSACTION_LOG_BY_BLOCK_HEIGHT = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_TRANSACTION_LOG_BY_ACTION_HASH:
          serviceImpl.getTransactionLogByActionHash((com.github.iotexproject.grpc.api.GetTransactionLogByActionHashRequest) request,
              (io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.GetTransactionLogByActionHashResponse>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_LOG_BY_BLOCK_HEIGHT:
          serviceImpl.getTransactionLogByBlockHeight((com.github.iotexproject.grpc.api.GetTransactionLogByBlockHeightRequest) request,
              (io.grpc.stub.StreamObserver<com.github.iotexproject.grpc.api.GetTransactionLogByBlockHeightResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetTransactionLogByActionHashMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.github.iotexproject.grpc.api.GetTransactionLogByActionHashRequest,
              com.github.iotexproject.grpc.api.GetTransactionLogByActionHashResponse>(
                service, METHODID_GET_TRANSACTION_LOG_BY_ACTION_HASH)))
        .addMethod(
          getGetTransactionLogByBlockHeightMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.github.iotexproject.grpc.api.GetTransactionLogByBlockHeightRequest,
              com.github.iotexproject.grpc.api.GetTransactionLogByBlockHeightResponse>(
                service, METHODID_GET_TRANSACTION_LOG_BY_BLOCK_HEIGHT)))
        .build();
  }

  private static abstract class TransactionLogServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TransactionLogServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.github.iotexproject.grpc.api.Api.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TransactionLogService");
    }
  }

  private static final class TransactionLogServiceFileDescriptorSupplier
      extends TransactionLogServiceBaseDescriptorSupplier {
    TransactionLogServiceFileDescriptorSupplier() {}
  }

  private static final class TransactionLogServiceMethodDescriptorSupplier
      extends TransactionLogServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    TransactionLogServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (TransactionLogServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TransactionLogServiceFileDescriptorSupplier())
              .addMethod(getGetTransactionLogByActionHashMethod())
              .addMethod(getGetTransactionLogByBlockHeightMethod())
              .build();
        }
      }
    }
    return result;
  }
}
