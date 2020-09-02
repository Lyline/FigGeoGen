package fr.GCQuesne;

import java.awt.*;
import java.lang.reflect.Field;
import java.util.ArrayList;

public class ShapeGen {
  protected static int referenceX;
  protected static int refShape = -1;
  protected int referenceY;
  protected int x1DiameterWidthShape;
  protected int y1HeightShape;
  protected int x2;
  protected int y2;
  protected int x3;
  protected int y3;
  protected int initialPositionX;
  protected int initialPositionY;
  ;

  protected String typeShape, colorShape;
  protected int[] refPointShape;
  protected int[] dimensionShape;

  ArrayList<ShapeGen> myTab = new ArrayList<>();

  public ShapeGen() {
  }

  public ShapeGen(String type, String color, int[] refPointXY, int[] diameterDimensionsXY) {
    refPointShape = new int[2];
    refPointShape = refPointXY;

    dimensionShape = new int[diameterDimensionsXY.length];
    dimensionShape = diameterDimensionsXY;

    this.typeShape = type;
    this.colorShape = color;

    this.referenceX = refPointXY[0];
    this.referenceY = refPointXY[1];
    this.initialPositionX = refPointXY[0];
    this.initialPositionY = refPointXY[1];

    switch (type) {
      case "circle":
        this.x1DiameterWidthShape = diameterDimensionsXY[0];
        break;

      case "rectangle":
        this.x1DiameterWidthShape = diameterDimensionsXY[0];
        this.y1HeightShape = diameterDimensionsXY[1];
        break;

      case "triangle":
        this.x1DiameterWidthShape = diameterDimensionsXY[0];
        this.y1HeightShape = diameterDimensionsXY[1];
        this.x2 = diameterDimensionsXY[2];
        this.y2 = diameterDimensionsXY[3];
        this.x3 = diameterDimensionsXY[4];
        this.y3 = diameterDimensionsXY[5];
        break;

      default:
        System.out.println("Forme inconnue");
    }

  }

  private ArrayList<ShapeGen> createArrayShape(Graphics graphics) {
    myTab.add(new Rectangle("rectangle", "cyan", new int[]{200, 150}, new int[]{30, 50}, graphics));
    myTab.add(new Circle("circle", "blue", new int[]{100, 400}, new int[]{20}, graphics));
    myTab.add(new Triangle("triangle", "magenta", new int[]{100, 300}, new int[]{50, 350, 100, 300, 150, 350}, graphics));
    return myTab;
  }

  protected Color colorSelected(String value) {
    Color colorTest;
    try {
      Field field = Class.forName("java.awt.Color").getField(value);
      colorTest = (Color) field.get(value);
    } catch (Exception exception) {
      colorTest = null;
    }
    return colorTest;
  }

  protected int selectRightPoint() {
    refShape = 0;
    for (ShapeGen element : myTab)
      if (element.referenceX > refShape) refShape = element.referenceX;
    return refShape;
  }

  public void draw(Graphics g) {
    ArrayList<ShapeGen> myTabPrint = createArrayShape(g);
    for (int i = 0; i < myTabPrint.size(); i++) {
      myTabPrint.get(i);
    }
  }


}




