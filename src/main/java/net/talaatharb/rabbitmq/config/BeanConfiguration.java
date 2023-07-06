package net.talaatharb.rabbitmq.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

import net.talaatharb.rabbitmq.constants.QueueConstants;

@Configuration
@EnableScheduling
public class BeanConfiguration {

	@Bean
	Queue myQueue() {
	    return new Queue(QueueConstants.QUEUE_NAME, false);
	}
}
