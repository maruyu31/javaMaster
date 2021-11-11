public class IfTest4 {
  public static void main(String[] args) {
    int myAge = 25;
    char myBloodType = 'A';
    if (myAge == 25 && myBloodType == 'B') {
      System.out.println("私の年齢は25歳で血液型はB型です！");
    } else if (myAge == 25 && myBloodType == 'A') {
      System.out.println("私の年齢は25歳で血液型はA型です！");
    } else if (myAge == 35 && myBloodType == 'B') {
      System.out.println("私の年齢は35歳で血液型はA型です！");
    } else {
      System.out.println("私の年齢と血液型は考えているものではないです！");
    }
    System.out.println("私の出身地は・・・");
  }
}
