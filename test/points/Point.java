package points;
/**
 * @description:
 * @author: zwjlf
 * @created: 2020/09/08 23:14
 */

public class Point {
  public int x, y;
  void move(int dx, int dy) { x += dx; y += dy; }
  public void moveAlso(int dx, int dy) { move(dx, dy); }
}
