package com.systemdesign.notificationserviceone;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class OrderListener {

	@RabbitListener(queues = { "${rabbitmq.queue.createorder.name}" })
	public void listen(String in) {
		System.out.println("Order creation request received : " + in.toString());
	}

}
