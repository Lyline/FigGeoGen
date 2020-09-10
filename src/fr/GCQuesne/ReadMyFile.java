package fr.GCQuesne;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import static fr.GCQuesne.ShapeGen.myTab;
import static java.lang.Integer.parseInt;

public class ReadMyFile {
  private BufferedReader fR;
  static ReadMyFile myFile = new ReadMyFile();

  public void openFile() throws IOException {
    fR = new BufferedReader(new FileReader(new File("liste.txt")));
  }

  public static void createArrayShape() throws IOException {
    String line;
    String[] arrayShape;
    String type;

    myFile.openFile();

    do {
      line = myFile.readFile();

      if (line != null) {
        arrayShape = line.split(";");
        type = arrayShape[0];
        switch (type) {
          case "circle":
            myTab.add(new Circle(parseInt(arrayShape[2]), parseInt(arrayShape[3]), parseInt(arrayShape[4]), arrayShape[1]));
            break;
          case "rectangle":
            myTab.add(new Rectangle(parseInt(arrayShape[2]), parseInt(arrayShape[3]), parseInt(arrayShape[4]), parseInt(arrayShape[4]), arrayShape[1]));
            break;
          case "triangle":
            myTab.add(new Triangle(parseInt(arrayShape[2]), parseInt(arrayShape[3]), parseInt(arrayShape[4]), parseInt(arrayShape[5]), parseInt(arrayShape[6]), parseInt(arrayShape[7]), arrayShape[1]));
            break;
          default:
            System.out.println("connais pas cette forme");
        }
      }
    } while (line != null);
    myFile.closeFile();
  }

  public void closeFile() throws IOException {
    fR.close();
  }

  public String readFile() throws IOException {
    return fR.readLine();
  }
}
