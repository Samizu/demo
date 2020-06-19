package org.kafka.consumer.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: jiangjiamiao
 * @Date: 2020/6/19 13:50
 * @LastEditTime: 2020/6/19 13:50
 * @LastEditors: jiangjiamiao
 */
@Configuration
@EnableConfigurationProperties(KafkaConfig.class)
public class KafkaConfig {
}
