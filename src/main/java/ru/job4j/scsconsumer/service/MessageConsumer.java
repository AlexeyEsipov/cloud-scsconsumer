package ru.job4j.scsconsumer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import java.util.function.Consumer;

@Component
public class MessageConsumer {

    private static final Logger log = LoggerFactory.getLogger(MessageConsumer.class);

    @Bean
    public Consumer<String> input0() {
        return message -> {
            log.info("from pipeline1: {}", message);
        };
    }

    @Bean
    public Consumer<String> input1() {
        return message -> {
            log.info("from pipeline3: {}", message);
        };
    }
}
