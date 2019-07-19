package com.spring.cloud.stream.listener;

import com.spring.cloud.stream.model.RecadoMessage;
import com.spring.cloud.stream.processor.InclusaoRecadoCacheProcessor;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class InclusaoRecadoCacheListener {

    @StreamListener(InclusaoRecadoCacheProcessor.INPUT)
    public void forward(@Payload RecadoMessage payload) {
        System.out.println("InclusaoRecadoCacheListener - "+payload.toString());
    }

}
