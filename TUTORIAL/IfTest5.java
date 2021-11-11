public class IfTest5 {
  public static void main(String[] args) {
    int myAge = 40;
    String myBloodType = "AB";
    if (myAge == 25 || myBloodType.equals("B")) {
      System.out.println("私の年齢は25歳または血液型はB型です！");
    } else if (myAge == 25 || myBloodType.equals("A")) {
      System.out.println("私の年齢は25歳または血液型はA型です！");
    } else if (myAge == 35 || myBloodType.equals("O")) {
      System.out.println("私の年齢は35歳または血液型はO型です！");
    } else if (myAge == 35 || myBloodType.equals("AB")) {
      System.out.println("私の年齢は35歳または血液型はAB型です！");
    } else {
      System.out.println("私の年齢と血液型は不明です！");
    }
    System.out.println("私の出身地は・・・");
  }
}
