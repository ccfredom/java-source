package wrap.java.util.concurrent;

import java.util.concurrent.Executors;

/**
 * @description:
 * @author: zwjlf
 * @created: 2020/08/05 16:53
 */
public class ThreadPoolExecutorTest {

  public static void main(String[] args) {
    Executors.newFixedThreadPool(1).execute(() -> {
      int  i = 0;
      while(true){
        i++;
        System.out.println("我在执行------");
        if(i % 10 == 9){
          throw new RuntimeException("sss");
        }
      }
    });
  }

}
