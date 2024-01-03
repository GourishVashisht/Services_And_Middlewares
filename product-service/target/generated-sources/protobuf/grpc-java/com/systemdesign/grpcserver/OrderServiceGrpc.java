package com.systemdesign.grpcserver;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.52.1)",
    comments = "Source: OrderService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class OrderServiceGrpc {

  private OrderServiceGrpc() {}

  public static final String SERVICE_NAME = "com.systemdesign.grpcserver.OrderService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.systemdesign.grpcserver.OrderPlacementRequest,
      com.systemdesign.grpcserver.OrderPlacementResponse> getPlaceOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "placeOrder",
      requestType = com.systemdesign.grpcserver.OrderPlacementRequest.class,
      responseType = com.systemdesign.grpcserver.OrderPlacementResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.systemdesign.grpcserver.OrderPlacementRequest,
      com.systemdesign.grpcserver.OrderPlacementResponse> getPlaceOrderMethod() {
    io.grpc.MethodDescriptor<com.systemdesign.grpcserver.OrderPlacementRequest, com.systemdesign.grpcserver.OrderPlacementResponse> getPlaceOrderMethod;
    if ((getPlaceOrderMethod = OrderServiceGrpc.getPlaceOrderMethod) == null) {
      synchronized (OrderServiceGrpc.class) {
        if ((getPlaceOrderMethod = OrderServiceGrpc.getPlaceOrderMethod) == null) {
          OrderServiceGrpc.getPlaceOrderMethod = getPlaceOrderMethod =
              io.grpc.MethodDescriptor.<com.systemdesign.grpcserver.OrderPlacementRequest, com.systemdesign.grpcserver.OrderPlacementResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "placeOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.systemdesign.grpcserver.OrderPlacementRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.systemdesign.grpcserver.OrderPlacementResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrderServiceMethodDescriptorSupplier("placeOrder"))
              .build();
        }
      }
    }
    return getPlaceOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.systemdesign.grpcserver.OrderUpdateRequest,
      com.systemdesign.grpcserver.OrderUpdateResponse> getUpdateOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateOrder",
      requestType = com.systemdesign.grpcserver.OrderUpdateRequest.class,
      responseType = com.systemdesign.grpcserver.OrderUpdateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.systemdesign.grpcserver.OrderUpdateRequest,
      com.systemdesign.grpcserver.OrderUpdateResponse> getUpdateOrderMethod() {
    io.grpc.MethodDescriptor<com.systemdesign.grpcserver.OrderUpdateRequest, com.systemdesign.grpcserver.OrderUpdateResponse> getUpdateOrderMethod;
    if ((getUpdateOrderMethod = OrderServiceGrpc.getUpdateOrderMethod) == null) {
      synchronized (OrderServiceGrpc.class) {
        if ((getUpdateOrderMethod = OrderServiceGrpc.getUpdateOrderMethod) == null) {
          OrderServiceGrpc.getUpdateOrderMethod = getUpdateOrderMethod =
              io.grpc.MethodDescriptor.<com.systemdesign.grpcserver.OrderUpdateRequest, com.systemdesign.grpcserver.OrderUpdateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.systemdesign.grpcserver.OrderUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.systemdesign.grpcserver.OrderUpdateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrderServiceMethodDescriptorSupplier("updateOrder"))
              .build();
        }
      }
    }
    return getUpdateOrderMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OrderServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrderServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrderServiceStub>() {
        @java.lang.Override
        public OrderServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrderServiceStub(channel, callOptions);
        }
      };
    return OrderServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OrderServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrderServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrderServiceBlockingStub>() {
        @java.lang.Override
        public OrderServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrderServiceBlockingStub(channel, callOptions);
        }
      };
    return OrderServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OrderServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrderServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrderServiceFutureStub>() {
        @java.lang.Override
        public OrderServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrderServiceFutureStub(channel, callOptions);
        }
      };
    return OrderServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class OrderServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void placeOrder(com.systemdesign.grpcserver.OrderPlacementRequest request,
        io.grpc.stub.StreamObserver<com.systemdesign.grpcserver.OrderPlacementResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPlaceOrderMethod(), responseObserver);
    }

    /**
     */
    public void updateOrder(com.systemdesign.grpcserver.OrderUpdateRequest request,
        io.grpc.stub.StreamObserver<com.systemdesign.grpcserver.OrderUpdateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateOrderMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPlaceOrderMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.systemdesign.grpcserver.OrderPlacementRequest,
                com.systemdesign.grpcserver.OrderPlacementResponse>(
                  this, METHODID_PLACE_ORDER)))
          .addMethod(
            getUpdateOrderMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.systemdesign.grpcserver.OrderUpdateRequest,
                com.systemdesign.grpcserver.OrderUpdateResponse>(
                  this, METHODID_UPDATE_ORDER)))
          .build();
    }
  }

  /**
   */
  public static final class OrderServiceStub extends io.grpc.stub.AbstractAsyncStub<OrderServiceStub> {
    private OrderServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrderServiceStub(channel, callOptions);
    }

    /**
     */
    public void placeOrder(com.systemdesign.grpcserver.OrderPlacementRequest request,
        io.grpc.stub.StreamObserver<com.systemdesign.grpcserver.OrderPlacementResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPlaceOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateOrder(com.systemdesign.grpcserver.OrderUpdateRequest request,
        io.grpc.stub.StreamObserver<com.systemdesign.grpcserver.OrderUpdateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateOrderMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class OrderServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<OrderServiceBlockingStub> {
    private OrderServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrderServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.systemdesign.grpcserver.OrderPlacementResponse placeOrder(com.systemdesign.grpcserver.OrderPlacementRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPlaceOrderMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.systemdesign.grpcserver.OrderUpdateResponse updateOrder(com.systemdesign.grpcserver.OrderUpdateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateOrderMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class OrderServiceFutureStub extends io.grpc.stub.AbstractFutureStub<OrderServiceFutureStub> {
    private OrderServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrderServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.systemdesign.grpcserver.OrderPlacementResponse> placeOrder(
        com.systemdesign.grpcserver.OrderPlacementRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPlaceOrderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.systemdesign.grpcserver.OrderUpdateResponse> updateOrder(
        com.systemdesign.grpcserver.OrderUpdateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateOrderMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PLACE_ORDER = 0;
  private static final int METHODID_UPDATE_ORDER = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final OrderServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(OrderServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PLACE_ORDER:
          serviceImpl.placeOrder((com.systemdesign.grpcserver.OrderPlacementRequest) request,
              (io.grpc.stub.StreamObserver<com.systemdesign.grpcserver.OrderPlacementResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ORDER:
          serviceImpl.updateOrder((com.systemdesign.grpcserver.OrderUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.systemdesign.grpcserver.OrderUpdateResponse>) responseObserver);
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

  private static abstract class OrderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OrderServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.systemdesign.grpcserver.OrderServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("OrderService");
    }
  }

  private static final class OrderServiceFileDescriptorSupplier
      extends OrderServiceBaseDescriptorSupplier {
    OrderServiceFileDescriptorSupplier() {}
  }

  private static final class OrderServiceMethodDescriptorSupplier
      extends OrderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    OrderServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (OrderServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OrderServiceFileDescriptorSupplier())
              .addMethod(getPlaceOrderMethod())
              .addMethod(getUpdateOrderMethod())
              .build();
        }
      }
    }
    return result;
  }
}
