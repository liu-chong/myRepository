package com.example.demo.model;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;

import java.util.Optional;


public class KafkaReceiver {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(KafkaSender.class);

    @KafkaListener(topics = {"kafkaTest"})
    public void listen(ConsumerRecord<?, ?> record) {
        Optional<?> kafkaMessage = Optional.ofNullable(record.value());
        if (kafkaMessage.isPresent()) {
            Object message = kafkaMessage.get();
            LOGGER.info("----------------- record =" + record);
            LOGGER.info("------------------ message =" + message);
        }
    }

}
