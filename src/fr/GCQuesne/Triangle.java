package fr.GCQuesne;

import java.awt.*;

public class Triangle extends ShapeGen {
  static int X1;
  static int Y1;
  static int X2;
  static int Y2;
  static int X3;
  static int Y3;


  protected Triangle(int x1, int y1, int x2, int y2, int x3, int y3, String color, Graphics g) {
    super(x1, y1);
    int[] xPoints = {X1, X2, X3};
    int[] yPoints = {Y1, Y2, Y3};

    X1 = x1;
    Y1 = y1;
    X2 = x2;
    Y2 = y2;
    X3 = x3;
    Y3 = y3;

    g.setColor(colorSelected(color));
    g.fillPolygon(xPoints, yPoints, 3);

  }


}
