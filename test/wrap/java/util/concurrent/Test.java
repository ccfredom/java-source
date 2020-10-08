package wrap.java.util.concurrent;

/**
 * @description:
 * @author: zwjlf
 * @created: 2020/09/08 23:15
 */

import java.util.ArrayList;
import java.util.List;

class Test {
  public static void main(String[] args) {
    System.out.println(1<<31);
    List<?>[] s = new ArrayList<?>[0];

    System.out.println(f1() | f2());
    System.out.println(f2() & f1());
  }

  private static boolean f1(){
    System.out.println("f1");
    return true;
  }

  private static boolean f2(){
    System.out.println("f2");
    return false;
  }
}