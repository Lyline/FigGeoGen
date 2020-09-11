package fr.GCQuesne;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
  private DrawShape myPanel = new DrawShape();
  private ToolBar myToolBar = new ToolBar();
  private Container contentPane = getContentPane();

  public MainWindow() {
    setTitle("FigGeoGen");
    setSize(500, 800);
    setLocation(1300, 200);
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    myPanel.setBackground(Color.WHITE);

    contentPane.add(myPanel, BorderLayout.CENTER);
    contentPane.add(myToolBar.create(), BorderLayout.SOUTH);

  }
}
