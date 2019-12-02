package com.ascension.neurons.alexademo;

import com.ascension.neurons.alexademo.config.AlexaConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import( AlexaConfiguration.class)
public class AlexademoApplication {

    public static void main( String[] args ) {
        SpringApplication.run( AlexademoApplication.class, args );
    }

}
