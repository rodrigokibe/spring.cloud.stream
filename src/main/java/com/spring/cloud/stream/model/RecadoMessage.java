package com.spring.cloud.stream.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class RecadoMessage implements Serializable {

    private static final long serialVersionUID = 1L;

    private String message;
    private LocalDateTime dataEvento;

    public RecadoMessage() {

    }

    public RecadoMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(LocalDateTime dataEvento) {
        this.dataEvento = dataEvento;
    }

    @Override
    public String toString() {
        return message;
    }

}
