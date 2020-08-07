package fr.GCQuesne;

import javax.swing.*;
import java.awt.*;

public class DrawSwing extends JPanel {
  private ShapeGen shape;

  public DrawSwing() {
    setBackground(Color.white);
  }

  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    shape = new ShapeGen();
    shape.draw(g);
  }
}
