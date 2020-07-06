package publisher.rabbitmqpublisher.rabbitmq.sender;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service

public class RabbitMQSender {
	
	@Autowired
	private AmqpTemplate rabbitTemplate;
 
	@Value("${queue.rabbitmq.exchange}")
	private String exchange;
 
	@Value("${queue.rabbitmq.routingkey}")
	private String routingkey;
 
	@Scheduled
	public void send(String message) {
		String customMessage = "This is a message from sender"+ message;
  
		rabbitTemplate.convertAndSend(exchange, routingkey, customMessage);
		//System.out.println("Send msg to consumer= " + CustomMessage+" ");
 
	}
}