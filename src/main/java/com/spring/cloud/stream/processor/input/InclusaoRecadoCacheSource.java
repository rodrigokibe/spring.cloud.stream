package com.spring.cloud.stream.processor.input;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface InclusaoRecadoCacheSource {

    String INPUT = "inputInclusaoRecadoCache";

    @Input(InclusaoRecadoCacheSource.INPUT)
    SubscribableChannel inputInclusaoRecadoCache();


}

