package com.wayne.factory;

import com.wayne.bean.*;

public class ImplShapeFactory implements  ShapeFactory{
    @Override
    public Shape createShap(String shapeType, ShapeRequest shapeRequest) {
        Shape shape;
        switch (shapeType){
            case "Circle":
                shape = new Circle(shapeRequest.getRadius());
                break;
            case "Rectangle":
                shape = new Rectangle(shapeRequest.getHigh(),shapeRequest.getWidth());
                break;
            case "Square":
                shape = new Square(shapeRequest.getHigh(),shapeRequest.getWidth());
                break;
            default:
                return null;
        }
        shape.calculateArea();
        return shape;
    }
}
