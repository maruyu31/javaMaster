public class EscapeTest {
  public static void main(String[] args) {
    System.out.println("Hello!");
    System.out.println("Double quote(\") is displayed"); // バックスラッシュでエスケープ
    char c = '\'';
    System.out.println(c);
    System.out.println("\\ is displayed");

    // System.out.println("Hello!\n World!!"); // 改行の制御文字
    // System.out.println("Hello!\t World!!"); // 改行の制御文字

    String str = null;
    boolean test = true;
    if (test == true) {
      str = "Hello!\n World!!";
    } else {
      str = "Hello! World!!";
    }
    System.out.println(str);
  }
}
