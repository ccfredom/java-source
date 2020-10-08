/**
 * @description:
 * @author: zwjlf
 * @created: 2020/09/08 23:15
 */
package morepoints;
public class PlusPoint extends points.Point {
  public void move(int dx, int dy) {
//    super.move(dx, dy);  // compile-time error
    moveAlso(dx, dy);
  }

  @Override
  public void moveAlso(int dx, int dy) {
//    super.moveAlso(dx, dy);
  }
}