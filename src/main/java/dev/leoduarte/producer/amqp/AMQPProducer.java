package dev.leoduarte.producer.amqp;

public interface AMQPProducer<T> {

	void producer(T t);
}
