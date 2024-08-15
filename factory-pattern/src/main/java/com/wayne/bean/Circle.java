package com.wayne.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class Circle extends Shape{

    Double radius = 0.0;

    static  final Double pi = 3.14;

    @Override
    public void calculateArea() {
        System.out.format("Circle Area : %f\n", Math.pow(radius, 2) * pi);
    }
}
