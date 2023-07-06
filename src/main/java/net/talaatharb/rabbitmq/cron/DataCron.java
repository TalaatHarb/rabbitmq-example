package net.talaatharb.rabbitmq.cron;

import java.time.LocalDateTime;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.talaatharb.rabbitmq.constants.QueueConstants;

@Component
@RequiredArgsConstructor
@Slf4j
public class DataCron {
	
	private final AmqpTemplate amqpTemplate;
	
	@Scheduled(fixedDelay = 1000)
	public void sendData() {
		LocalDateTime now = LocalDateTime.now();
		log.info("Sending: {}", now.toString());
		amqpTemplate.convertAndSend(QueueConstants.QUEUE_NAME, now);
	}

}
