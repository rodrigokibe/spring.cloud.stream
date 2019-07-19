package com.spring.cloud.stream.processor.input;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface InclusaoRecadoPostegreSQLSource {

    String INPUT = "inputInclusaoRecadoPostegreSQL";

    @Input(InclusaoRecadoPostegreSQLSource.INPUT)
    SubscribableChannel inputInclusaoRecadoPostegreSQL();


}

