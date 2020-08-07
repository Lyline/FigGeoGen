package fr.GCQuesne;

import java.awt.*;

public class Rectangle extends ShapeGen {
  int height = 50;
  int width = 100;
  int positionX = 0;
  int positionY = 0;
  Color color = Color.RED;

  protected Rectangle(Graphics g) {
    setReferenceX(positionX);
    setReferenceY(positionY);
    g.setColor(color);
    g.fillRect(positionX, positionY, width, height);

  }
}
