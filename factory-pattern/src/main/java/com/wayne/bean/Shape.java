package com.wayne.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public abstract class Shape {

    Double high  = 0.0;

    Double width = 0.0;

    public abstract void calculateArea();
}
