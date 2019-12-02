package com.ascension.neurons.alexademo.handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.amazon.ask.request.Predicates;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class HelloWorldIntentHandler implements RequestHandler {

    @Override
    public boolean canHandle( HandlerInput handlerInput ) {
        return handlerInput.matches( Predicates.intentName("HelloWorldIntent"));
    }

    @Override
    public Optional< Response > handle( HandlerInput handlerInput ) {
        String speechText = "Hello world";

        return handlerInput.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("HelloWorld", speechText)
                .build();
    }
}
