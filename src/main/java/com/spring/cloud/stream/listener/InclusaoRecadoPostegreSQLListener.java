package com.spring.cloud.stream.listener;

import com.spring.cloud.stream.model.RecadoMessage;
import com.spring.cloud.stream.processor.InclusaoRecadoPostegreSQLProcessor;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
public class InclusaoRecadoPostegreSQLListener {

    @StreamListener(InclusaoRecadoPostegreSQLProcessor.INPUT)
    public void forward(RecadoMessage payload) {
        System.out.println("InclusaoRecadoPostegreSQLListener "+payload.toString());
    }
}
