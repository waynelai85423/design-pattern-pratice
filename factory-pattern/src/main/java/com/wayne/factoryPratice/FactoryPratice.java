package com.wayne.factoryPratice;

import com.wayne.bean.ShapeRequest;
import com.wayne.factory.ImplShapeFactory;

public class FactoryPratice {
    public static void main(String[] args) {
        ImplShapeFactory implShapeFactory = new ImplShapeFactory();
        ShapeRequest shapeRequest = ShapeRequest.builder().high(10.0).width(25.0).radius(15.0).build();
        implShapeFactory.createShap("Circle",shapeRequest);
        implShapeFactory.createShap("Rectangle",shapeRequest);
        implShapeFactory.createShap("Square",shapeRequest);

    }
}
