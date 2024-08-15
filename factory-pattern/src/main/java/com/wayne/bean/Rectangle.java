package com.wayne.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@SuperBuilder
public class Rectangle extends Shape{

    public Rectangle(Double high, Double width) {
        super(high,width);
    }

    @Override
    public void calculateArea() {
        System.out.format("Rectangle Area : %f\n", this.high * this.width);
    }
}
