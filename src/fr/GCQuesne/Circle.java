package fr.GCQuesne;

import java.awt.*;

public class Circle extends ShapeGen {
  int diameter = 70;
  int positionX = 30;
  int positionY = 400;
  Color color = Color.BLUE;

  protected Circle(Graphics g) {
    setReferenceX(positionX);
    setReferenceY(positionY);
    g.setColor(color);
    g.fillOval(positionX, positionY, diameter, diameter);

  }
}
