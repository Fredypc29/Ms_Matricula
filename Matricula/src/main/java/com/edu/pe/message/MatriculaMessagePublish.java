package com.edu.pe.message;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.edu.pe.controller.MatriculaController;
import com.edu.pe.model.MatriculaModel;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class MatriculaMessagePublish {
	private Logger logger = LoggerFactory.getLogger(MatriculaMessagePublish.class);
	@Value("${spring.kafka.template.default-topic}")
	private String topicName;
	
	@Autowired
	private ObjectMapper objectMapper;
	
	@Autowired
	private KafkaTemplate<Integer, String> kafkaTemplate;

	public void sendMatriculaEvent(MatriculaModel payModel) throws JsonProcessingException {

		String value = objectMapper.writeValueAsString(payModel);
		logger.info("enviado!:" + value);
		kafkaTemplate.send(topicName, value);
	} 

}
