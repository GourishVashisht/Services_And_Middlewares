package com.systemdesign.orderservice.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.systemdesign.grpcserver.OrderPlacementRequest;
import com.systemdesign.grpcserver.OrderPlacementResponse;
import com.systemdesign.grpcserver.OrderServiceGrpc.OrderServiceImplBase;
import com.systemdesign.grpcserver.OrderUpdateRequest;
import com.systemdesign.grpcserver.OrderUpdateResponse;
import com.systemdesign.grpcserver.ProductDTO;
import com.systemdesign.orderservice.model.Product;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class CreateOrderService extends OrderServiceImplBase {

	@Autowired
	private NotificationService notificationService;

	@Override
	public void placeOrder(OrderPlacementRequest request, StreamObserver<OrderPlacementResponse> responseObserver) {
		ProductDTO productDTO = request.getProductDTO();
		System.out.println("Received order placement request " + productDTO);
		notificationService.sendCreateOrderNotification(Product.toProduct(productDTO));

		OrderPlacementResponse response = OrderPlacementResponse.newBuilder().setResponse("PLACED").build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

	@Override
	public void updateOrder(OrderUpdateRequest request, StreamObserver<OrderUpdateResponse> responseObserver) {
		ProductDTO productDTO = request.getProductDTO();
		System.out.println("Received order update request " + productDTO);
		notificationService.sendOrderUpdateNotification(Product.toProduct(productDTO));

		OrderUpdateResponse response = OrderUpdateResponse.newBuilder().setResponse("UPDATED").build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

}
