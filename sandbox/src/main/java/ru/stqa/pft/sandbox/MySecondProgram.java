package ru.stqa.pft.sandbox;

public class MySecondProgram {

  public static void main(String[] args) {

    hello("my name is Luba");
    hello("my name is Tester");
    hello("my name is Tester1");

    Point p1 = new Point(5, 2);
    Point p2 = new Point(1, 1);

    System.out.println("Расстояние между точкой p1(" + p1.x + ", " + p1.y + ") и точкой p2(" + p2.x + ", " + p2.y + ") = " +  p1.distance(p2));
  }
  public static void hello(String somebody) {


    System.out.println("Hello, " + somebody + "!");
  }


}