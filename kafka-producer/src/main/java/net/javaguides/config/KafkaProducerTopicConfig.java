package net.javaguides.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaProducerTopicConfig {

    public static String topicName = "wikimediarecentchange";

    @Bean
    public NewTopic topic(){
        return TopicBuilder.name(topicName).build();
    }



}