package fr.GCQuesne;

import java.awt.*;

public class Triangle extends ShapeGen {

  protected Triangle(String type, String color, int[] refPointXY, int[] coordinatePoints, Graphics g) {
    super(type, color, refPointXY, coordinatePoints);

    int[] xPoints = {this.x1DiameterWidthShape, this.x2, this.x3};
    int[] yPoints = {this.y1HeightShape, this.y2, this.y3};

    g.setColor(colorSelected(color));
    g.fillPolygon(xPoints, yPoints, 3);
  }

}
