package jp.co.funatz.pkgTest;

// import jp.co.funatz.pkgTest.a.PackageA;
// import jp.co.funatz.pkgTest.b.PackageB;
import jp.co.funatz.pkgTest.a.*;
import jp.co.funatz.pkgTest.b.*;


public class PackageTest {
  public static void main(String[] args) {
    // jp.co.funatz.pkgTest.a.PackageA.a();
    // jp.co.funatz.pkgTest.b.PackageB.b();
    PackageA.a();
    PackageA1.a();
    PackageA2.a();
    PackageA3.a();
    PackageA4.a();
    PackageA5.a();

    PackageB.b();
    PackageB1.b();
    PackageB2.b();
    PackageB3.b();
    PackageB4.b();
    PackageB5.b();
    jp.co.funatz.pkgTest.a.PackageZ.z();
    jp.co.funatz.pkgTest.b.PackageZ.z();
  }
}
