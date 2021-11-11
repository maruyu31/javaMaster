public class SwitchTest {
  public static void main(String[] args) {
    int myAge = 50;
    switch(myAge) {
      case 15:
        System.out.println("私の年齢は１５歳です");
        break;
      case 25:
        System.out.println("私の年齢は２５歳です");
        break;
      case 35:
        System.out.println("私の年齢は３５歳です");
        break;
      case 45:
        System.out.println("私の年齢は４５歳です");
        break;
      default:
        System.out.println("私の年齢はその他です");
        break;
    }
  }
}
