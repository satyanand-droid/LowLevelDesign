package org.example.factory;

import java.util.Optional;

public class ShapeFactory {
  private Optional<Shape> shape;

  public Optional<Shape> getShape(String type) {
    if (type.equalsIgnoreCase("rectangle")) {
      shape = Optional.of(new Rectangle());
    } else if (type.equalsIgnoreCase("circle")) {
      shape = Optional.of(new Circle());
    } else if (type.equalsIgnoreCase("square")) {
      shape = Optional.of(new Square());
    } else {
      shape = null;
    }
    return shape;
  }
}
