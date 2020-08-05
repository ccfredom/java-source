package wrap.java.util.concurrent;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: zwjlf
 * @created: 2020/07/28 19:37
 */
public class StreamReduceTest {

    public static void main(String[] args) {
        //测试容器的reduce操作，是否会创建新的collection
        List<String> s = new ArrayList<>();
        s.add("1");
        s.add("2");
        s.add("3");
//        List<String> co = s.stream().reduce(new ArrayList<Wrap>(), (cl, s2) ->{
//
//        });
    }

    static class Wrap {
        private String name;

        public Wrap(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Wrap{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
