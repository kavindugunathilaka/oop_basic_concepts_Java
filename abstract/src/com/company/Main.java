package com.company;

abstract class Shape {

   abstract public int getArea();
   //can't implmnt this method
}

class Rectangle extends Shape{
    int length , width;


        public int getArea() {
            return (length * width);
        }
}
class Circle extends Shape{
    int radius;


    public int getArea(){
        return (int)(3.14 * radius * radius);
    }

}

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Shape s1 = new Rectangle();
        Rectangle r1 = new Rectangle();
        r1.width = 12;
        r1.length = 20;
        System.out.println("area of " + r1.getArea());



    }
}
