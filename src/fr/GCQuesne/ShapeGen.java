package fr.GCQuesne;

import java.awt.*;
import java.util.ArrayList;

public class ShapeGen {
  private int referenceY;
  private int referenceX;
  ArrayList<ShapeGen> myTab = new ArrayList<>();

  public ShapeGen() {

  }

  private ArrayList createArrayShape(Graphics graphics) {
    myTab.add(new Circle(graphics));
    myTab.add(new Rectangle(graphics));
    myTab.add(new Triangle(graphics));

    return myTab;
  }

  public void draw(Graphics g) {
    ArrayList myTabPrint = createArrayShape(g);

    for (int i = 0; i < myTabPrint.size(); i++) {
      myTabPrint.get(i);
    }

  }

  public int getReferenceY() {
    return referenceY;
  }

  public void setReferenceY(int referenceY) {
    this.referenceY = referenceY;
  }

  public int getReferenceX() {
    return referenceX;
  }

  public void setReferenceX(int referenceX) {
    this.referenceX = referenceX;
  }

}

