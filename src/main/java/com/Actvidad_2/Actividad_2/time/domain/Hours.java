package com.Actvidad_2.Actividad_2.time.domain;

import com.Actvidad_2.Actividad_2.common.Preconditions;
import lombok.Value;

@Value(staticConstructor = "of")
public class Hours {
    private final Integer value;

    public Hours(Integer value){
        Preconditions.checkNotNull(value);
        Preconditions.checkArgument(value >= 0 && value <= 23);
        this.value = value;
    }
}
