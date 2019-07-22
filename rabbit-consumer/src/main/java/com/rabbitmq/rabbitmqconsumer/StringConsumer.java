package com.rabbitmq.rabbitmqconsumer;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @program: rabbitmq
 * @description: rabbitmq消费者 @RabbitListener(queues = "simpleMsg") 监听名simpleMsg的队列
 * @author: caicy
 * @create: 2019-07-20 10:37
 */
@Component
@RabbitListener(queues = "string")
public class StringConsumer {

    @Autowired
    private AmqpTemplate amqpTemplate;


    /**
     * 消息消费
     * @RabbitHandler 代表此方法为接受到消息后的处理方法
     */
    @RabbitHandler
    public void recieved(String msg) {
        System.out.println("[string] recieved message:" + msg);
    }

}
