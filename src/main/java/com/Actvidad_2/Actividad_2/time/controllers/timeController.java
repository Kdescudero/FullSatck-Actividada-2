package com.Actvidad_2.Actividad_2.time.controllers;

import com.Actvidad_2.Actividad_2.time.domain.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Time;
import java.time.LocalTime;

@RequestMapping("/v1/time")
@RestController
public class timeController {

    @GetMapping("/Hours")
    private TimeDay getHour(){
        LocalTime now = LocalTime.now();
        Hours hours = Hours.of(now.getHour());
        Minutes minutes = Minutes.of(now.getMinute());
        Seconds seconds = Seconds.of(now.getSecond());

        Long minutos = TimeUniEnum.fromHour(TimeUniEnum.MINUTES, now);

        return TimeDay.from(hours, minutes, seconds, minutos.intValue());
    }
}
