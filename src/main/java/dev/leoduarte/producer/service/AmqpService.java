package dev.leoduarte.producer.service;

import dev.leoduarte.producer.dto.Message;

public interface AmqpService {

	void sendToConsumer(Message message);
}
