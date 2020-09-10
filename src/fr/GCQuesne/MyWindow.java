package fr.GCQuesne;

import javax.swing.*;
import java.awt.*;

public class MyWindow extends JFrame {
  private JPanel myPanel = new JPanel();
  private ToolBar myToolBar = new ToolBar();
  private Container contentPane = getContentPane();

  public MyWindow() {
    setTitle("FigGeoGen");
    setSize(500, 800);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    myPanel.setBackground(Color.WHITE);

    contentPane.add(myPanel, BorderLayout.CENTER);
    contentPane.add(myToolBar.create(), BorderLayout.SOUTH);

  }
}
