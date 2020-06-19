package org.kafka.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

/**
 * @Author: jiangjiamiao
 * @Date: 2020/6/19 13:32
 * @LastEditTime: 2020/6/19 13:32
 * @LastEditors: jiangjiamiao
 */
@SpringBootApplication
@EnableKafka
public class Application {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

}
