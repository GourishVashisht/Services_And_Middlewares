package com.systemdesign.productservice.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.systemdesign.productservice.model.AddProductRequest;
import com.systemdesign.productservice.model.Product;
import com.systemdesign.productservice.model.UpdateProductRequest;
import com.systemdesign.productservice.service.GrpcClientService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/products")
public class ProductResource {

	@Autowired
	private GrpcClientService grpcClientService;

	@PostMapping
	public ResponseEntity<String> placeOrder(@RequestBody AddProductRequest addProductRequest) {
		Product product = addProductRequest.getProduct();
		log.debug("Received place order request : {}", product);
		String response = grpcClientService.placeOrder(product);
		return ResponseEntity.ok(response);
	}

	@PutMapping("/{productId}")
	public ResponseEntity<String> updateOrder(@PathVariable Long productId,
			@RequestBody UpdateProductRequest updateProductRequest) {
		log.debug("Received update order request for product id: {}", productId);
		String response = grpcClientService.updateOrder(updateProductRequest.getProduct());
		return ResponseEntity.ok(response);
	}

}
