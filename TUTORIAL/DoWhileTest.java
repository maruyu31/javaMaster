public class DoWhileTest {
  public static void main(String[] args) {
    System.out.println("多い番号順から点呼取ります！");
    int number = 11;
    do {
      System.out.println(number + "!!");
      number--;
    } while(number <= 10 && number >=1);
    System.out.println("以上！" + number + "人！");
  }
}
