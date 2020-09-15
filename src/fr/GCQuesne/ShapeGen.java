package fr.GCQuesne;

import java.io.IOException;
import java.util.ArrayList;

import static fr.GCQuesne.ReadMyFile.myFile;
import static java.lang.Integer.parseInt;

public class ShapeGen {
  static String shapeState;
  int x1, y1,
      x2, y2,
      x3, y3,
      initialX1, initialX2, initialX3;
  String colorShape;
  String typeShape;

  //Tableau qui regroupe toutes les figures
  static ArrayList<ShapeGen> myTab = new ArrayList<>();

  /**
   * Construit une figure géométrique de type générique, avec des coordonnées de position pour chaque point et une
   * couleur
   *
   * @param color couleur de la figure
   * @param x1    abscisse du premier point
   * @param y1    ordonnée du premier point
   * @param x2    abscisse du second point
   * @param y2    ordonnée du second point
   * @param x3    abscisse du troisième point
   * @param y3    ordonnée du troisième point
   */
  public ShapeGen(String color,
                  int x1, int y1,
                  int x2, int y2,
                  int x3, int y3) {

    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
    this.x3 = x3;
    this.y3 = y3;

    this.initialX1 = this.x1;
    this.initialX2 = this.x2;
    this.initialX3 = this.x3;

    this.colorShape = color;

    shapeState = "default";
  }

  /**
   * Construit une figure géométrique de type cercle ou rectangle, avec des coordonnées de position de son origine (en
   * haut à gauche), des dimensions et une couleur
   *
   * @param color  couleur de la figure
   * @param x      abscisse de son origine
   * @param y      ordonnée de son origine
   * @param width  longueur de la figure
   * @param height hauteur de la figure
   */
  public ShapeGen(String color,
                  int x, int y,
                  int width, int height) {

    this.x1 = x;
    this.y1 = y;
    this.x2 = width;
    this.y2 = height;

    this.initialX1 = x1;

    colorShape = color;

    shapeState = "default";
  }

  /**
   * Imprime le contenu d'une figure (coordonnées, couleur et état)
   *
   * @param shapeGen nom de la figure à imprimer
   */
  public static void printShape(ShapeGen shapeGen) {
    System.out.println("type : " + shapeGen.typeShape + " color : " + shapeGen.colorShape);
    System.out.println("x1 : " + shapeGen.x1 + " y1 : " + shapeGen.y1);
    System.out.println("x2 : " + shapeGen.x2 + " y2 : " + shapeGen.y2);
    System.out.println("x3 : " + shapeGen.x3 + " y3 : " + shapeGen.y3);
    System.out.println("state : " + shapeState + "\n");
  }

  /**
   * Imprime l'ensemble du tableau contenant les figures instanciées
   */
  public static void printShapeTab() {
    for (ShapeGen element : myTab) printShape(element);
  }

  /**
   * Aligne toutes les figures à gauche de la fenêtre en remplaçant la valeur de l'abscisse du premier point ou du point
   * de l'origine par 0 (x1 = 0)
   */
  public static void leftAlign() {
    for (ShapeGen element : myTab) {
      int distanceX = element.x1;
      shapeState = "gauche";
      element.x1 = 0;

      if (element.typeShape.equalsIgnoreCase("Triangle")) {
        element.x2 -= distanceX;
        element.x3 -= distanceX;
      }
    }
  }

  /**
   * Cherche et renvoie la valeur de l'abscisse de la figure située le plus à droite en parcourant le tableau des
   * figures instanciées
   *
   * @return valeur de l'abscisse la plus élevée
   */
  private static int searchRightPoint() {
    int rightPoint = 0;
    for (ShapeGen element : myTab)
      if (element.initialX1 > rightPoint) rightPoint = element.initialX1;
      else if (element.typeShape.equalsIgnoreCase("triangle")
          &&
          element.initialX2 > rightPoint) rightPoint = element.initialX2;

    return rightPoint;
  }

  /**
   * Aligne toutes les figures par rapport à la figure placée le plus à droite de la fenêtre
   */
  public static void rightAlign() {
    int rightPointX = searchRightPoint();
    for (ShapeGen element : myTab) {
      shapeState = "droite";

      if (element.typeShape.equalsIgnoreCase("Triangle") && element.initialX2 == rightPointX) {
        element.x1 = element.initialX1;
        element.x2 = element.initialX2;
        element.x3 = element.initialX3;
      } else if (element.typeShape.equalsIgnoreCase("Triangle")) {
        element.x1 = element.initialX1;
        element.x2 = element.initialX2;
        element.x3 = element.initialX3;

        element.x1 += rightPointX - element.initialX2;
        element.x2 = rightPointX;
        element.x3 += rightPointX - element.initialX2;
      } else element.x1 = rightPointX;
    }
  }

  /**
   * Crée un ArrayList d'objets ShapeGen à partir du fichier .txt
   *
   * @return ArrayList des formes géométriques
   * @throws IOException Lecture impossible du fichier .txt
   */
  public static ArrayList<ShapeGen> createArrayShape() throws IOException {
    String line;
    String[] arrayShape;
    String type;
    ArrayList<ShapeGen> tempList = new ArrayList<>();

    myFile.openFile();

    do {
      line = myFile.readFile();

      if (line != null) {
        arrayShape = line.split(";");
        type = arrayShape[0];
        switch (type) {
          case "circle":
            tempList.add(new Circle(parseInt(arrayShape[2]), parseInt(arrayShape[3]), parseInt(arrayShape[4]), arrayShape[1]));
            break;
          case "rectangle":
            tempList.add(new Rectangle(parseInt(arrayShape[2]), parseInt(arrayShape[3]), parseInt(arrayShape[4]), parseInt(arrayShape[4]), arrayShape[1]));
            break;
          case "triangle":
            tempList.add(new Triangle(parseInt(arrayShape[2]), parseInt(arrayShape[3]), parseInt(arrayShape[4]), parseInt(arrayShape[5]), parseInt(arrayShape[6]), parseInt(arrayShape[7]), arrayShape[1]));
            break;
          default:
            System.out.println("connais pas cette forme");
        }
      }
    } while (line != null);
    myFile.closeFile();
    return tempList;
  }
}




