package fr.GCQuesne;

import java.io.IOException;

import static fr.GCQuesne.ReadMyFile.createArrayShape;
import static fr.GCQuesne.ShapeGen.printShapeTab;

public class AppWindow {

  public static void main(String[] args) throws IOException {
    createArrayShape();
    printShapeTab();

  }

}
