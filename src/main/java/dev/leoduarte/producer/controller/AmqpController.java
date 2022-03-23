package dev.leoduarte.producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import dev.leoduarte.producer.dto.Message;
import dev.leoduarte.producer.service.AmqpService;

@RestController("/")
public class AmqpController {

	@Autowired
	private AmqpService service;

	@PostMapping("/send")
	@ResponseStatus(code = HttpStatus.ACCEPTED)
	public void sendToConsumer(@RequestBody Message message) {
		service.sendToConsumer(message);
	}
}
