package fr.GCQuesne;

public class Rectangle extends ShapeGen {
  public Rectangle(int originX, int originY, int width, int height, String color) {
    super(color, originX, originY, width, height);
    typeShape = "rectangle";
  }
}
