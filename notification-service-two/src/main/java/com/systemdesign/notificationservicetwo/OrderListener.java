package com.systemdesign.notificationservicetwo;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class OrderListener {

	@RabbitListener(queues = { "${rabbitmq.queue.createorder.name}" })
	public void createOrderListener(String in) {
		System.out.println("Order creation request received : " + in.toString());
	}

	@RabbitListener(queues = { "${rabbitmq.queue.updateorder.name}" })
	public void updateOrderListener(String in) {
		System.out.println("Order updation request received : " + in.toString());
	}

}
