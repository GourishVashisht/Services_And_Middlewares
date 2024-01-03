package com.systemdesign.orderservice.model;

import com.systemdesign.grpcserver.ProductDTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Product {

	private String id;

	private String color;

	private String description;

	private Float price;

	public static Product toProduct(ProductDTO productDTO) {
		return Product.builder().id(productDTO.getId()).color(productDTO.getColor())
				.description(productDTO.getDescription())
				.price(productDTO.getPrice()).build();
	}

}
