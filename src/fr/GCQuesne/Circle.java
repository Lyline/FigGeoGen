package fr.GCQuesne;

public class Circle extends ShapeGen {
  public Circle(int originX, int originY, int diameter, String color) {
    super(color, originX, originY, diameter, diameter);
    typeShape = "circle";
  }
}
