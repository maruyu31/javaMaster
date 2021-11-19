public class ForTest {
  public static void main(String[] args) {
    for (int i = 1; i <= 10; i++) {
      if (i == 5) {
        System.out.println("次のループに進む");
        continue;
      }
      System.out.println("繰り返し:" + i + "週目");
    }
    int k = 1;
    int l = 5;
    System.out.println("kの初期値" + k);
    while(k <= 5) {
      System.out.println("while繰り返し:" + k + "週目。lの値:" + l);
      k++;
    }
    System.out.println("ブロックを抜けた後のlの値" + l); // スコープ外！
    System.out.println("プログラムの終了");
    System.out.println("kの終了値" + k);
  }
}
