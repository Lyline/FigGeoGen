package fr.GCQuesne;

import javax.swing.*;
import java.awt.*;

public class ToolBar extends JPanel {
  JButton sceneButton = new JButton("À gauche / Scène");
  JButton formeButton = new JButton("À gauche / Formes");

  public JPanel create() {
    JPanel contentTool = new JPanel(new FlowLayout());
    contentTool.setBackground(Color.lightGray);
    contentTool.setSize(new Dimension(0, 50));
    contentTool.add(sceneButton);
    contentTool.add(formeButton);

    return contentTool;
  }
}
