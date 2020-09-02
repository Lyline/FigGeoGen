package fr.GCQuesne;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static fr.GCQuesne.AppWindow.myDraw;
import static fr.GCQuesne.ShapeGen.refShape;

public class ToolBar extends JPanel implements ActionListener {
  JButton sceneButton = new JButton("À gauche / Scène");
  JButton formeButton = new JButton("À gauche / Formes");

  public JPanel create() {
    JPanel contentTool = new JPanel(new FlowLayout());
    contentTool.setBackground(Color.lightGray);
    contentTool.setSize(new Dimension(0, 50));
    contentTool.add(sceneButton);
    contentTool.add(formeButton);
    sceneButton.addActionListener(this);

    return contentTool;
  }

  public void actionPerformed(ActionEvent event) {
    if (event.getSource() == sceneButton) myDraw.moveLeft();
    else if (event.getSource() == formeButton) myDraw.moveRight(refShape);
  }
}
