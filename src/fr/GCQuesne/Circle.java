package fr.GCQuesne;

import java.awt.*;

public class Circle extends ShapeGen {
  static int positionX;
  static int positionY;
  int diameter;

  protected Circle(int referenceX, int referenceY, int diameter, String color, Graphics g) {
    super(referenceX, referenceY);
    this.diameter = diameter;
    positionX = referenceX;
    positionY = referenceY;
    g.setColor(colorSelected(color));
    g.fillOval(positionX, positionY, diameter, diameter);
  }


}
