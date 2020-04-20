package com.Actvidad_2.Actividad_2.time.domain;

import com.Actvidad_2.Actividad_2.common.Preconditions;
import lombok.Value;

@Value(staticConstructor = "of")
public class Seconds {
    private final Integer value;

    public Seconds(Integer value){
        Preconditions.checkNotNull(value);
        Preconditions.checkArgument(value >= 0 && value <= 59);
        this.value = value;
    }
}
