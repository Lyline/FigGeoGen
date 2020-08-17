package fr.GCQuesne;

import java.awt.*;

public class Circle extends ShapeGen {

  protected Circle(String type, String color, int[] refPointXY, int[] diameter, Graphics g) {
    super(type, color, refPointXY, diameter);

    g.setColor(colorSelected(color));
    g.fillOval(this.referenceX, this.referenceY, this.x1DiameterWidthShape, this.x1DiameterWidthShape);
  }

}
