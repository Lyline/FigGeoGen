package fr.GCQuesne;

import static fr.GCQuesne.ShapeGen.*;

public class AppWindow {

  public static void main(String[] args) {

    Triangle myTriangle = new Triangle(150, 100, 200, 30, 250, 100, "Cyan");
    Circle myCircle = new Circle(100, 50, 80, "Red");
    Rectangle myRectangle = new Rectangle(300, 300, 250, 100, "Green");


    myTab.add(myRectangle);
    myTab.add(myCircle);
    myTab.add(myTriangle);

    printShapeTab();

    System.out.println("---- alignement a gauche ----");
    leftAlign();
    printShapeTab();

    System.out.println("---- alignement a droite ----");
    rightAlign();
    printShapeTab();
  }
}
