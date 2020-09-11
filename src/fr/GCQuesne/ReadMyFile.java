package fr.GCQuesne;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadMyFile {
  private BufferedReader fR;
  static ReadMyFile myFile = new ReadMyFile();

  public void openFile() throws IOException {
    fR = new BufferedReader(new FileReader(new File("liste.txt")));
  }

  public void closeFile() throws IOException {
    fR.close();
  }

  public String readFile() throws IOException {
    return fR.readLine();
  }
}
