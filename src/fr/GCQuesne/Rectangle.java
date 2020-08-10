package fr.GCQuesne;

import java.awt.*;

public class Rectangle extends ShapeGen {
  static int positionX;
  static int positionY;
  int height;
  int width;

  protected Rectangle(int referenceX, int referenceY, int height, int width, String color, Graphics g) {
    super(referenceX, referenceY);
    this.height = height;
    this.width = width;
    positionX = referenceX;
    positionY = referenceY;
    g.setColor(colorSelected(color));
    g.fillRect(positionX, positionY, width, height);
  }

}
