package com.ascension.neurons.alexademo.handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.LaunchRequest;
import com.amazon.ask.model.Response;
import com.amazon.ask.request.Predicates;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class LaunchRequestHandler implements RequestHandler {

    @Override
    public boolean canHandle( HandlerInput handlerInput ) {
        return handlerInput.matches( Predicates.requestType( LaunchRequest.class));
    }

    @Override
    public Optional< Response > handle( HandlerInput handlerInput ) {
        String speechText = "Welcome to the Alexa Skills Kit, you can say hello";

        return handlerInput.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("HelloWorld", speechText)
                .withReprompt(speechText)
                .build();
    }
}
