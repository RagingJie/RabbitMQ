package com.poying.app;

import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class AppApplicationTests {

    @Resource
    private RabbitTemplate rabbitTemplate;

    @Test
    void contextLoads() {
    }

    @Test
    public void testSendMessageToQueue() {
        String queuesName = "testQueues";
        String msg = "你好，RabbitMQ，很高兴认识你！wwwwwwwwww";
        rabbitTemplate.convertAndSend(queuesName, msg);
    }

}
