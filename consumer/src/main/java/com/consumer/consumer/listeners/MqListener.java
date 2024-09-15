package com.consumer.consumer.listeners;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author
 * @Date 2024/9/16 2:46
 * @Description:
 */
@Component
public class MqListener {

    @RabbitListener(queues = "testQueues")
    public void listener(String msg) {
        System.out.println("消费者收到了rabbitMQ中的消息：" + msg);
    }
}
