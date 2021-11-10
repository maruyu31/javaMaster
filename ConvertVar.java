public class ConvertVar {
  public static void main(String[] args) {
    int number1 = 100;
    long number2 = 200;
    System.out.println("number1: " + number1);
    System.out.println("number2: " + number2);
    number2 = number1;  //longの変数にintの値を代入
    System.out.println("number1: " + number1);
    System.out.println("number2: " + number2);

    number1 = 100;
    number2 = 200;
    number1 = (int)number2; //intの変数にlongの値を削って（キャスト）代入
    System.out.println("number1: " + number1);
    System.out.println("number2: " + number2);

    double number3 = 10.5;
    number2 = (long)number3; //longの変数にdoubleの値を削って（キャスト）代入
    System.out.println("number2: " + number2);
    System.out.println("number3: " + number3);

  }
}
