package com.wayne.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@SuperBuilder
public class Square extends Shape{

    public Square(Double high, Double width) {
        super(high,width);
    }

    @Override
    public void calculateArea() {
        System.out.format("Rectangle Square : %f\n", Math.pow(this.width,2));
    }
}
