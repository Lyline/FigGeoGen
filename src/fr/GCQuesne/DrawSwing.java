package fr.GCQuesne;

import javax.swing.*;
import java.awt.*;

public class DrawSwing extends JPanel {

  public DrawSwing() {
    setBackground(Color.white);
  }

  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    new ShapeGen().draw(g);
  }

  protected void moveLeft() {
    ShapeGen.refShape = 0;
    repaint();
  }

  protected void moveRight(int selectRightPoint) {
    ShapeGen.refShape = selectRightPoint;
    repaint();
  }
}
