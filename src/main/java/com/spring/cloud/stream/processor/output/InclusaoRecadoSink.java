package com.spring.cloud.stream.processor.output;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface InclusaoRecadoSink {

    String OUTPUT = "outputInclusaoRecado";

    @Output(InclusaoRecadoSink.OUTPUT)
    MessageChannel outputInclusaoRecado();

}
