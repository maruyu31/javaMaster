public class ArrayTest2 {
  public static void main(String[] args) {
    // String[] customer;
    int a = 2;
    // customer = new String[3];

    // switch (a) {
    //   case 1:
    //     customer[0] = "鈴木太朗";
    //     customer[1] = "zeus@xxxxx.com";
    //     customer[2] = "090-0000-9999";
    //     break;
    //   case 2:
    //     customer[0] = "鈴木太朗";
    //     customer[1] = "zeus@xxxxx.com";
    //     break;
    //   case 3:
    //     customer[0] = "鈴木太朗";
    //     break;
    // }

    // for(int i = 0; i < customer.length; i++) {
    //   if (customer[i] != null) {
    //     System.out.println(customer[i]);
    //   }
    // }

    // System.out.println();

    // String[] customer2 =  {"鈴木太朗", "zeustarou@xxxxx.com", "090-0000-9999"}; // new 型名[]で初期貸す場合、宣言と初期化を同時に行う
    String[] customer2; // 条件分岐をする場合初期化と宣言を分ける必要がある　後付けで追加はできない
    switch (a) {
        case 1:
          customer2 = new String[] {"鈴木太朗", "zeustarou@xxxxx.com", "090-0000-9999"};
          break;
        case 2:
          customer2 = new String[] {"鈴木太朗", "zeustarou@xxxxx.com"};
          break;
        default:
          customer2 = new String[] {"鈴木太朗"};
          break;
      }
    for(String customer2Value : customer2) {
      System.out.println(customer2Value);
    }
  }
}
