package fr.GCQuesne;

import javax.swing.*;
import java.awt.*;

public class AppWindow extends JFrame {

  public static DrawSwing myDraw = new DrawSwing();

  public AppWindow() {
    super("- FigGeoGen -");
    this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    this.setSize(400, 700);
    this.setLocationRelativeTo(null);

    ToolBar toolBar = new ToolBar();
    JPanel contentPane = (JPanel) this.getContentPane();
    contentPane.add(myDraw, BorderLayout.CENTER);
    contentPane.add(toolBar.create(), BorderLayout.SOUTH);
  }

  public static void main(String[] args) {
    AppWindow myWindow = new AppWindow();
    myWindow.setVisible(true);
  }
}
