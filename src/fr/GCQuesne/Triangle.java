package fr.GCQuesne;

public class Triangle extends ShapeGen {
  public Triangle(int x1, int y1, int x2, int y2, int x3, int y3, String color) {
    super(color, x1, y1, x2, y2, x3, y3);
    typeShape = "triangle";
  }
}
