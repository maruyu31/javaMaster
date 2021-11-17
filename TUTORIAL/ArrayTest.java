public class ArrayTest {
  public static void main(String[] args) {
    // String name = "鈴木太郎";
    // String email = "zeus@xxxxx.com";
    // String phone = "090-0000-9999";
    // System.out.println(name);
    // System.out.println(email);
    // System.out.println(phone);

    // System.out.println();

    String[] customer;
    customer = new String[3];
    customer[0] = "鈴木太朗";
    customer[1] = "zeus@xxxxx.com";
    customer[2] = "090-0000-9999";
    // System.out.println(customer[0]);
    // System.out.println(customer[1]);
    // System.out.println(customer[2]);
    for(int i = 0; i < customer.length; i++) {
      System.out.println(customer[i]);
    }

    System.out.println();

    // String[] customer2;
    // customer2 = {"鈴木太朗", "zeus@xxxxx.com", "090-0000-9999"}; // {}で初期化する場合、宣言と初期化を分けられない
    // String[] customer2;
    // customer2 = new String[] {"鈴木太朗", "zeus@xxxxx.com", "090-0000-9999"}; // new 型名[] {}で初期化する場合、宣言と初期化を分けられる
    String[] customer2 =  {"鈴木太朗", "zeustarou@xxxxx.com", "090-0000-9999"}; // new 型名[]で初期貸す場合、宣言と初期化を同時に行う
    // System.out.println(customer2[0]);
    // System.out.println(customer2[1]);
    // System.out.println(customer2[2]);
    for(String customer2Value : customer2) {
      System.out.println(customer2Value);
    }
  }
}
