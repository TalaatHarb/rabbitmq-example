package net.talaatharb.rabbitmq.listeners;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
import net.talaatharb.rabbitmq.constants.QueueConstants;

@Component
@Slf4j
public class DataListener {

	@RabbitListener(queues = QueueConstants.QUEUE_NAME)
	public void listen(String in) {
	    log.info("Message read from myQueue : " + in);
	}
}
