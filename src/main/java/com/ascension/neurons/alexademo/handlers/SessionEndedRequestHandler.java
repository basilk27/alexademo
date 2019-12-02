package com.ascension.neurons.alexademo.handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.amazon.ask.model.SessionEndedRequest;
import org.springframework.stereotype.Component;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.requestType;

@Component
public class SessionEndedRequestHandler implements RequestHandler {
    @Override
    public boolean canHandle( HandlerInput handlerInput ) {
        return handlerInput.matches(requestType( SessionEndedRequest.class));
    }

    @Override
    public Optional< Response > handle( HandlerInput handlerInput ) {
        // any cleanup logic goes here
        return handlerInput.getResponseBuilder().build();
    }
}
