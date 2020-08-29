package wrap.java.util.concurrent;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @description:
 * @author: zwjlf
 * @created: 2020/08/11 22:10
 */
public class StringTest {

  public static void encode_ios_8859_1() throws UnsupportedEncodingException {
    System.out.println(Arrays.toString("中".getBytes()));
    for(byte b : "中".getBytes()){
      System.out.println(Integer.toBinaryString(Byte.toUnsignedInt(b)));
    }
    System.out.println(Arrays.toString("中".getBytes("iso-8859-1")));
    for(byte b : "中".getBytes("iso-8859-1")){
      System.out.println(Integer.toBinaryString(Byte.toUnsignedInt(b)));
    }
  }

  public static void encode() {
    String name = "I am 君山";
//    toHex(name.toCharArray());
    try {
      byte[] iso8859 = name.getBytes("ISO-8859-1");
      hex(iso8859);
      byte[] gb2312 = name.getBytes("GB2312");
      hex(gb2312);
      byte[] gbk = name.getBytes("GBK");
      hex(gbk);
      byte[] utf16 = name.getBytes("UTF-16");
      hex(utf16);
      byte[] utf8 = name.getBytes("UTF-8");
      hex(utf8);
    } catch (UnsupportedEncodingException e) {
      e.printStackTrace();
    }
  }

  private static void toHex(char[] toCharArray) {
    for(char b : toCharArray){
      System.out.print(Integer.toHexString(b));
    }
    System.out.println();
  }



  public static String hex(byte[] bytes) {
    StringBuilder result = new StringBuilder();
    for (byte aByte : bytes) {
      int decimal = (int) aByte & 0xff;               // bytes widen to int, need mask, prevent sign extension
      // get last 8 bits
      String hex = Integer.toHexString(decimal);
      if (hex.length() % 2 == 1) {                    // if half hex, pad with zero, e.g \t
        hex = "0" + hex;
      }
      result.append(hex);
    }
    System.out.println(result);
    return result.toString();
  }

  public static void main(String[] args) {
    encode();
  }
}
