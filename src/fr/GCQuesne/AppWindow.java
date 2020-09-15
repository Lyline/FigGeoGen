package fr.GCQuesne;

import javax.swing.*;
import java.io.IOException;

import static fr.GCQuesne.ShapeGen.createArrayShape;
import static fr.GCQuesne.ShapeGen.myTab;

public class AppWindow {

  public static void main(String[] args) throws IOException {
    myTab = createArrayShape();

    JFrame myWindow = new MainWindow();
    myWindow.setVisible(true);

  }

}
