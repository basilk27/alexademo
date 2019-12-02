package com.ascension.neurons.alexademo.handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import org.springframework.stereotype.Component;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

@Component
public class FallbackIntentHandler implements RequestHandler {
    @Override
    public boolean canHandle( HandlerInput handlerInput ) {
        return handlerInput.matches(intentName("AMAZON.FallbackIntent"));
    }

    @Override
    public Optional< Response > handle( HandlerInput handlerInput ) {
        String speechText = "Sorry, I don't know that. You can say try saying help!";

        return handlerInput.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("HelloWorld", speechText)
                .withReprompt(speechText)
                .build();
    }
}
