package wrap.java.util.concurrent;

/**
 * @description:
 * @author: zwjlf
 * @created: 2020/09/06 17:50
 */
class T0{
  String s0 = "0";
  String s() { return this.s0; }
  boolean t(){return this instanceof T3;}
}
class T1 extends T0 {
  String s0 = "1";
//  String s() { return "1"; }
}
class T2 extends T1 {
  String s0 = "2";
//  String s() { return this.s0; }
}
class T3 extends T2 {
  final String s() { return "3"; }
  public void test() {
//    s0 = "3";
    s();
    System.out.println("s()=\t\t"          + s0);
    System.out.println("((T0)super).s()=\t"    + super.s0);
    System.out.println("((T2)this).s()=\t" + ((T2)this).s0);
    System.out.println("((T1)this).s()=\t" + ((T1)this).s0);
//    System.out.println(t());
  }
}
public class Test2 {
  public static void main(String[] args) {
    T3 t3 = new T3();
    t3.test();
  }
}
