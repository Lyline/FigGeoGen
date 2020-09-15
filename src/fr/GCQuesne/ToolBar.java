package fr.GCQuesne;

import javax.swing.*;
import java.awt.*;

public class ToolBar extends JPanel {
  JPanel contentTool = new JPanel();
  JButton sceneButton = new JButton("A Gauche / Scène");
  JButton formeButton = new JButton("A Droite / Forme");

  public JPanel create() {
    contentTool.setBackground(Color.LIGHT_GRAY);
    contentTool.setPreferredSize(new Dimension(0, 50));

    contentTool.add(sceneButton);
    contentTool.add(formeButton);

    return contentTool;
  }


}
