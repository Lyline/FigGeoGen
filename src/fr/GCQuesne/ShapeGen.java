package fr.GCQuesne;

import java.awt.*;

public class ShapeGen {
  private int referenceY;

  private int referenceX;

  public ShapeGen() {

  }

  public void draw(Graphics g) {
    Circle myCircle = new Circle(g);
    new Rectangle(g);
    Triangle myTriangle = new Triangle(g);

    //System.out.println(myCircle.positionX);
    System.out.println("cercle : " + myCircle.getReferenceX());
    //System.out.println(myCircle.positionY);
    System.out.println("cercle : " + myCircle.getReferenceY());
    System.out.println("triangle" + myTriangle.getReferenceX());
    System.out.println("triangle" + myTriangle.getReferenceY());
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

