public class VariableTest {
  public static void main(String[] args) {
    int myAge;  // 変数宣言：情報が入る箱の形を決めてコンピュータに伝える
    myAge = 24;  //初期化
    myAge = 29;  //上書き
    // myAge = "ABC" // 不適合な方 静的型付け言語なので一度型を決めたら変更できない
    System.out.println(myAge);
  }
}
