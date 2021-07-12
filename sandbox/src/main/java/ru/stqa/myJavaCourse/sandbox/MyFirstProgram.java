package ru.stqa.myJavaCourse.sandbox;

public class MyFirstProgram {
  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("Irina");

    Square s = new Square(5);
    System.out.println("Площадь квадрата со стороной " + s.length + " = " + s.area());

    Rectangle r = new Rectangle(4, 6);
    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

    Point p = new Point(9,0);
		System.out.println("Расстояние меджу точками с координатами " + p.p1 + " и " + p.p2 + " = " + p.distance(p.p1,p.p2));

  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }

}
