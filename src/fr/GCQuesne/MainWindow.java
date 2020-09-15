package fr.GCQuesne;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static fr.GCQuesne.ShapeGen.leftAlign;
import static fr.GCQuesne.ShapeGen.rightAlign;

public class MainWindow extends JFrame implements ActionListener {
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

    myToolBar.sceneButton.addActionListener(this);
    myToolBar.formeButton.addActionListener(this);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == myToolBar.sceneButton) {
      leftAlign();
    }
    if (e.getSource() == myToolBar.formeButton) {
      rightAlign();
    }
    repaint();
  }
}
