package dev.leoduarte.producer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.leoduarte.producer.amqp.AMQPProducer;
import dev.leoduarte.producer.dto.Message;
import dev.leoduarte.producer.service.AmqpService;

@Service
public class RabbitService implements AmqpService {

	@Autowired
	private AMQPProducer<Message> amqpProducer;

	@Override
	public void sendToConsumer(Message message) {
		amqpProducer.producer(message);
	}

}
