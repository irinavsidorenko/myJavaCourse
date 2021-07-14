package ru.stqa.pft.sandbox;

import org.testng.Assert;
import ru.stqa.myJavaCourse.sandbox.Point;

public class PointTests {
  public void checkDistanceBetweenTwoPoints(){
    Point p = new Point(0,9);
    Assert.assertEquals(p.distance(0,9),9);
  }
}
