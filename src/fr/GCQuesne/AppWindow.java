package fr.GCQuesne;

import static fr.GCQuesne.ShapeGen.myTab;

public class AppWindow {

  public static void main(String[] args) {
    ShapeGen monTriangle = new ShapeGen("Triangle", "Blue",
        30, 50, 45, 100, 60, 50);

    ShapeGen monCercle = new ShapeGen("Cercle", "red",
        10, 80, 100, 100);

    ShapeGen monRectagle = new ShapeGen("Rectangle", "Green",
        200, 20, 100, 88);

    myTab.add(monTriangle);
    myTab.add(monCercle);
    myTab.add(monRectagle);
  }
}
