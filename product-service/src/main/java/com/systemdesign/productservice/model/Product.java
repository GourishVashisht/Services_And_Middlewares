package com.systemdesign.productservice.model;

import com.systemdesign.grpcserver.ProductDTO;

import lombok.Data;

@Data
public class Product {

	private String id;

	private String color;

	private String description;

	private Float price;

	public static ProductDTO toProductDTO(Product product) {
		return ProductDTO.newBuilder().setId(product.getId()).setColor(product.getColor())
				.setDescription(product.getDescription()).setPrice(product.getPrice()).build();
	}

}
