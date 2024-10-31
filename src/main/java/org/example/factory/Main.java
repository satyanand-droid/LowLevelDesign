package org.example.factory;

import java.util.Optional;

public class Main {
  public static void main(String[] args) {
    ShapeFactory shapeFactory = new ShapeFactory();
    Optional<Shape> shape = shapeFactory.getShape("circle");
    if (shape.isPresent()) {
      shape.get().draw();
    }
  }
}
