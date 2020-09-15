package fr.GCQuesne;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Field;

import static fr.GCQuesne.ShapeGen.myTab;

public class DrawShape extends JPanel {

  public void paintComponent(Graphics g) {
    super.paintComponent(g);

      for (ShapeGen shapeGen : myTab) {

        Color colorSelected = convertStringToColor(shapeGen.colorShape);

        switch (shapeGen.typeShape) {
          case "circle":
            g.setColor(colorSelected);
            g.fillOval(shapeGen.x1, shapeGen.y1, shapeGen.x2, shapeGen.y2);
            break;
          case "rectangle":
            g.setColor(colorSelected);
            g.fillRect(shapeGen.x1, shapeGen.y1, shapeGen.x2, shapeGen.y2);
            break;
          case "triangle":
            g.setColor(colorSelected);
            g.fillPolygon(new int[]{shapeGen.x1, shapeGen.x2, shapeGen.x3},
                new int[]{shapeGen.y1, shapeGen.y2, shapeGen.y3}, 3);
            break;
          default:
            System.out.println("forme inconnue");
        }
      }
  }

  private Color convertStringToColor(String color) {
    Color myColor;

    Field field;
    try {
      field = Class.forName("java.awt.Color").getField(color);
      myColor = (Color) field.get(null);
    } catch (Exception e) {
      myColor = null;
    }
    return myColor;
  }
}
