package publisher.rabbitmqpublisher.rabbitmq.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import publisher.rabbitmqpublisher.rabbitmq.sender.RabbitMQSender;

@RestController
public class RabbitMQTestController {
	
	
	@Autowired
	private RabbitMQSender rabbitMQSender;
	
	@RequestMapping(method=RequestMethod.GET, value = "/RabbitmqMessageSender")
	public void testMessage(@RequestParam String message) {
		System.out.println("Working");
		rabbitMQSender.send(message);
		
		
	}
}
