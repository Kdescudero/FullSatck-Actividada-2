package com.Actvidad_2.Actividad_2.configuration;

import com.Actvidad_2.Actividad_2.time.domain.Hours;
import com.Actvidad_2.Actividad_2.time.domain.Minutes;
import com.Actvidad_2.Actividad_2.time.domain.Seconds;
import com.Actvidad_2.Actividad_2.time.serialization.adacterHours;
import com.Actvidad_2.Actividad_2.time.serialization.adacterMinutes;
import com.Actvidad_2.Actividad_2.time.serialization.adacterSeconds;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GsonConfiguration {

    @Bean
    public Gson gson(){
        return new GsonBuilder()
                .registerTypeAdapter(Hours.class, new adacterHours())
                .registerTypeAdapter(Minutes.class, new adacterMinutes())
                .registerTypeAdapter(Seconds.class, new adacterSeconds())
                .create();
    }

}
