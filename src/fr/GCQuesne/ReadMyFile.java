package fr.GCQuesne;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadMyFile {
  private BufferedReader fR;

  public void openFile() throws IOException {
    fR = new BufferedReader(new FileReader(new File("liste.txt")));
  }

  public String readFile() throws IOException {
    String chaine = fR.readLine();
    return chaine;
  }

  public void closeFile() throws IOException {
    fR.close();
  }
}
