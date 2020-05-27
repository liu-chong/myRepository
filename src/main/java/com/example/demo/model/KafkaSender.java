package com.example.demo.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.Data;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

import java.util.Date;
import java.util.UUID;

public class KafkaSender {
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(KafkaSender.class);

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    private Gson gson = new GsonBuilder().create();
    //发送消息方法
    public void send() {
        KafkaMessage message = new KafkaMessage();
        message.setId(System.currentTimeMillis());
        message.setMsg(UUID.randomUUID().toString());
        message.setSendTime(new Date());
        LOGGER.info("+++++++++++++++++++++ message = {}", gson.toJson(message));
        kafkaTemplate.send("kafkaTest", gson.toJson(message));
    }

}
