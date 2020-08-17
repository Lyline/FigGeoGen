package fr.GCQuesne;

import java.awt.*;

public class Rectangle extends ShapeGen {

  protected Rectangle(String type, String color, int[] refPointXY, int[] dimension, Graphics g) {
    super(type, color, refPointXY, dimension);

    g.setColor(colorSelected(color));
    g.fillRect(this.referenceX, this.referenceY, this.x1DiameterWidthShape, this.y1HeightShape);
  }
}
