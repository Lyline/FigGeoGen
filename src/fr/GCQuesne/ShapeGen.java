package fr.GCQuesne;

import java.awt.*;
import java.lang.reflect.Field;
import java.util.ArrayList;

public class ShapeGen {
  protected int referenceY;
  protected int referenceX;

  ArrayList<ShapeGen> myTab = new ArrayList<>();

  public ShapeGen() {

  }

  public ShapeGen(int referenceX, int referenceY) {
    this.referenceX = referenceX;
    this.referenceY = referenceY;
  }

  public static Color colorSelected(String value) {
    Color colorTest;
    try {
      Field field = Class.forName("java.awt.Color").getField(value);
      colorTest = (Color) field.get(value);
    } catch (Exception exception) {
      colorTest = null;
    }
    return colorTest;
  }

  private ArrayList<ShapeGen> createArrayShape(Graphics graphics) {
    myTab.add(new Circle(100, 50, 400, "green", graphics));
    myTab.add(new Rectangle(200, 95, 210, 40, "blue", graphics));
    myTab.add(new Triangle(200, 40, 100, 180, 300, 280, "pink", graphics));

    return myTab;
  }

  public void draw(Graphics g) {
    ArrayList<ShapeGen> myTabPrint = createArrayShape(g);
    for (int i = 0; i < myTabPrint.size(); i++) {
      myTabPrint.get(i);
    }
  }


}




