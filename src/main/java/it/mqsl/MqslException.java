package it.mqsl;

import java.io.IOException;

public class MqslException extends RuntimeException {

    public MqslException(String message, IOException e) {
        super(message, e);
    }

}
