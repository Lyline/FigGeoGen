package fr.GCQuesne;

import java.io.IOException;

public class AppWindow {

  public static void main(String[] args) throws IOException {

    ReadMyFile myFile = new ReadMyFile();


    myFile.openFile();
    String chaine;
    do {
      chaine = myFile.readFile();
      if (chaine != null) System.out.println(chaine);
    } while (chaine != null);
    myFile.closeFile();


  }

}
