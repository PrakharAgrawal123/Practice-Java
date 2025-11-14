import java.io.*;

public class ThrowsExample {
  static void readFile() throws IOException {
    FileInputStream f = new FileInputStream("test.txt");
  }

  public static void main(String[] args) {
    try {
      readFile();
    } catch (IOException e) {
      System.out.println("File not found!");
    }
  }
}
