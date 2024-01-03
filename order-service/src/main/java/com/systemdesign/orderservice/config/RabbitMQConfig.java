package com.systemdesign.orderservice.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

	@Value(value = "${rabbitmq.exchange.ordercreation.name}")
	private String fanoutExchangeName;

	@Value(value = "${rabbitmq.exchange.orderupdation.name}")
	private String topicExchangeName;

	@Value(value = "${rabbitmq.queue.updateorder.routekey}")
	private String updateOrderRouteKey;

	@Value(value = "${rabbitmq.queue.createorder.name}")
	private String createOrderQueueName;

	@Value(value = "${rabbitmq.queue.updateorder.name}")
	private String updateOrderQueueName;

	@Bean
	public FanoutExchange fanoutExchange() {
		return new FanoutExchange(fanoutExchangeName);
	}

	@Bean
	public Queue createOrderQueue() {
		return new Queue(createOrderQueueName);
	}

	@Bean
	public Queue updateOrderQueue() {
		return new Queue(updateOrderQueueName);
	}

	@Bean
	public Binding bindingCreateOrderQueue(Queue createOrderQueue, FanoutExchange fanoutExchange) {
		return BindingBuilder.bind(createOrderQueue).to(fanoutExchange);
	}

	@Bean
	public Binding bindingUpdateOrderQueue(Queue updateOrderQueue, FanoutExchange fanoutExchange) {
		return BindingBuilder.bind(updateOrderQueue).to(fanoutExchange);
	}

	@Bean
	public TopicExchange topicExchange() {
		return new TopicExchange(topicExchangeName);
	}

	@Bean
	public Binding bindingUpdateOrderTopicExchange(Queue updateOrderQueue, TopicExchange topicExchange) {
		return BindingBuilder.bind(updateOrderQueue).to(topicExchange).with(updateOrderRouteKey);
	}

}
