package com.rabbitmq.rabbitmqconsumer;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @program: rabbitmq
 * @description: topic模式消费者C
 * @author: caicy
 * @create: 2019-07-20 12:41
 */
@Component
@RabbitListener(queues = "topic.c")
public class TopicCConsumer {

    @Autowired
    private AmqpTemplate rabbitmqTemplate;

    /**
     * 消息消费
     *
     * @RabbitHandler 代表此方法为接受到消息后的处理方法
     */
    @RabbitHandler
    public void recieved(String msg) {
        System.out.println("[topic.c] recieved message:" + msg);
    }
}
