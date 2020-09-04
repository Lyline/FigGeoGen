package fr.GCQuesne;

public class ShapeGen {
  int x1, y1,
      x2, y2,
      x3, y3,
      initialX;
  String typeShape, colorShape;
  String shapeState;

  /**
   * Construit une figure géométrique de type générique, avec des coordonnées de position pour chaque point et une
   * couleur
   *
   * @param shape type de la figure
   * @param color couleur de la figure
   * @param x1    abscisse du premier point
   * @param y1    ordonnée du premier point
   * @param x2    abscisse du second point
   * @param y2    ordonnée du second point
   * @param x3    abscisse du troisième point
   * @param y3    ordonnée du troisième point
   */
  public ShapeGen(String shape, String color,
                  int x1, int y1,
                  int x2, int y2,
                  int x3, int y3) {

    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
    this.x3 = x3;
    this.y3 = y3;

    this.initialX = x1;

    this.typeShape = shape;
    this.colorShape = color;

    shapeState = "default";
  }

  /**
   * Construit une figure géométrique de type cercle ou rectangle, avec des coordonnées de position de son origine (en
   * haut à gauche), des dimensions et une couleur
   *
   * @param shape  type de la figure
   * @param color  couleur de la figure
   * @param x      abscisse de son origine
   * @param y      ordonnée de son origine
   * @param width  longueur de la figure
   * @param height hauteur de la figure
   */
  public ShapeGen(String shape, String color,
                  int x, int y,
                  int width, int height) {

    this.x1 = x;
    this.y1 = y;
    this.x2 = width;
    this.y2 = height;

    this.initialX = x1;

    this.typeShape = shape;
    this.colorShape = color;

    shapeState = "default";
  }
}




