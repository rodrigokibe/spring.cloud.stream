package com.spring.cloud.stream.resource;

import com.spring.cloud.stream.model.RecadoMessage;
import com.spring.cloud.stream.processor.output.InclusaoRecadoSink;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;


@RestController
@RequestMapping("/write")
public class InitializeProcessors {

    private final Logger logger = LoggerFactory.getLogger(InitializeProcessors.class);

    @Autowired
    private InclusaoRecadoSink inclusaoRecadoSink;

    @GetMapping("/{valor}")
    public String write(@PathVariable("valor") String valor) {
        RecadoMessage msg = new RecadoMessage();
        msg.setDataEvento(LocalDateTime.now());
        msg.setMessage("Teste recado = " + valor);
        inclusaoRecadoSink.outputInclusaoRecado().send(MessageBuilder.withPayload(msg).build());
        return "Sucesso write " + valor;
    }

}
