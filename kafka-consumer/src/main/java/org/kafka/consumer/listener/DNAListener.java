package org.kafka.consumer.listener;

import org.kafka.consumer.constants.ConsumerConstant;

/**
 * Created by sanshui on 2020/6/19.
 */
@Component
public class DNAListener {

    @KafkaListener(topics = ConsumerConstant.DNA_IMPORT_KAFKA_TOPIC)
    public void onMessage(String json){
        System.out.println(message);
    }

}
