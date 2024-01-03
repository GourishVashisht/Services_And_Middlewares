package com.systemdesign.orderservice.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.systemdesign.orderservice.model.Product;

@Service
public class NotificationService {

	@Value(value = "${rabbitmq.exchange.ordercreation.name}")
	private String fanoutExchangeName;

	@Value(value = "${rabbitmq.exchange.orderupdation.name}")
	private String topicExchangeName;

	@Value(value = "${rabbitmq.queue.updateorder.routekey}")
	private String updateOrderRouteKey;

	@Value(value = "${rabbitmq.queue.createorder.name}")
	private String createOrderQueue;

	@Value(value = "${rabbitmq.queue.updateorder.name}")
	private String updateOrderQueue;

	@Autowired
	private RabbitTemplate rabbitTemplate;

	private ObjectMapper mapper = new ObjectMapper();

	public void sendCreateOrderNotification(Product product) {
		String productAsString = "";
		try {
			productAsString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(product);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		rabbitTemplate.convertAndSend(fanoutExchangeName, "", productAsString);
	}

	public void sendOrderUpdateNotification(Product product) {
		String productAsString = "";
		try {
			productAsString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(product);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		rabbitTemplate.convertAndSend(topicExchangeName, updateOrderRouteKey, productAsString);
	}

}
