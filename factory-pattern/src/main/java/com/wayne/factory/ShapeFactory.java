package com.wayne.factory;

import com.wayne.bean.Shape;
import com.wayne.bean.ShapeRequest;

public interface ShapeFactory {
    Shape createShap(String shapeType, ShapeRequest shapeRequest);
}
