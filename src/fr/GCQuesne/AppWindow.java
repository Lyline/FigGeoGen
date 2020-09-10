package fr.GCQuesne;

import javax.swing.*;
import java.io.IOException;

import static fr.GCQuesne.ReadMyFile.createArrayShape;
import static fr.GCQuesne.ShapeGen.printShapeTab;

public class AppWindow {

  public static void main(String[] args) throws IOException {
    createArrayShape();
    printShapeTab();
    JFrame myWindow = new MyWindow();
    myWindow.setVisible(true);

  }

}
