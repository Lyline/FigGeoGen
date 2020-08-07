package fr.GCQuesne;

import java.awt.*;

public class Triangle extends ShapeGen {
  Color color = Color.PINK;
  private int X1 = 100;
  private int Y1 = 200;
  private int X2 = 50;
  private int Y2 = 250;
  private int X3 = 150;
  private int Y3 = 250;
  private int[] xPoints = {X1, X2, X3};
  private int[] yPoints = {Y1, Y2, Y3};

  protected Triangle(Graphics g) {
    setReferenceX(X1);
    setReferenceY(Y1);
    g.setColor(color);
    g.fillPolygon(xPoints, yPoints, 3);
  }

}
