package com.systemdesign.productservice.service;

import org.springframework.stereotype.Service;

import com.systemdesign.grpcserver.OrderPlacementRequest;
import com.systemdesign.grpcserver.OrderPlacementResponse;
import com.systemdesign.grpcserver.OrderServiceGrpc;
import com.systemdesign.grpcserver.OrderUpdateRequest;
import com.systemdesign.grpcserver.OrderUpdateResponse;
import com.systemdesign.productservice.model.Product;

import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.client.inject.GrpcClient;

@Slf4j
@Service
public class GrpcClientService {

	@GrpcClient("grpc-server")
	OrderServiceGrpc.OrderServiceBlockingStub stub;

	public String placeOrder(Product product) {

		OrderPlacementResponse response = stub
				.placeOrder(OrderPlacementRequest.newBuilder().setProductDTO(Product.toProductDTO(product)).build());

		log.debug("Order placement response received : {}", response.getResponse());
		return response.getResponse();
	}

	public String updateOrder(Product product) {

		OrderUpdateResponse response = stub
				.updateOrder(OrderUpdateRequest.newBuilder().setProductDTO(Product.toProductDTO(product)).build());

		log.debug("Order placement response received : {}", response.getResponse());
		return response.getResponse();
	}

}
