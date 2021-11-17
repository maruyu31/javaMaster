public class VariableTest {
  public static void main(String[] args) {
    // 基本データ型の変数は初期化しなければならない
    int myAge; // 変数宣言：情報が入る箱の形を決めてコンピュータに伝える
    myAge = 24; // 初期化
    // myAge = 29; // 上書き
    // myAge = "ABC" // 不適合な方 静的型付け言語なので一度型を決めたら変更できない
    myAge = myAge + 5;
    System.out.println(myAge);

    // 配列の各要素は初期化しなくていい
    int[] ourAges = new int[5]; // 数値のデータ型は0が初期値
    System.out.println(ourAges[1]); // 初期値として0が代入されている

    boolean[] isChild = new boolean[5]; // booleanのデータ型はfalseが初期値
    System.out.println(isChild[1]); // 初期値としてfalseが代入されている

    char[] letter = new char[5]; // charのデータ型は''が初期値
    System.out.println(letter[1]);

    String[] text = new String[5]; // charのデータ型はnullが初期値
    System.out.println(text[1]);
  }
}
