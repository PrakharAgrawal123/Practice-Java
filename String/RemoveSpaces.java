public class RemoveSpaces {
  public static void main(String[] args) {
    String s = "Java is awesome";
    String result = s.replaceAll("\\s+", "");

    System.out.println(result);
  }
}
