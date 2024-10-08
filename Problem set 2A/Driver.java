/**
 * Bradley Phan
 * September 23th 2024
 * Problem Set 2A
 */


public class Driver{
public static void main(String []args){
    //isntantiation
    Circle c1 = new Circle();
    Circle c2 = new Circle(5);
    Cylinder c3 = new Cylinder();
    Cylinder c4 = new Cylinder(5, 5);
    
//circle 1
    System.out.println("a Circle with the default constructor");
    System.out.println(c1);
    System.out.println("getRadius() --> "+c1.getRadius() +" units");
    System.out.println("circumference() --> "+c1.circumference() +" units");
    System.out.println("area() --> "+ c1.area() +" units^2");
    System.out.println();
    
//circle 2
    System.out.println("a Circle with a parameterized constructor");
    System.out.println(c2);
    System.out.println("getRadius() --> "+c2.getRadius()+ " units");
    System.out.println("circumference() --> "+c2.circumference() +" units");
    System.out.println("area() --> "+ c2.area() +" units^2");
    System.out.println();
    
    System.out.println(c3);
    System.out.println("getRadius() --> "+c3.getRadius() +" units");
    System.out.println("getsurfaceArea() --> "+c3.surfaceArea() +" units");
    System.out.println("getVolume() --> "+c3.volume() +" units^2");
    System.out.println();
    
    System.out.println(c4);
    System.out.println("getRadius() --> "+c4.getRadius() +" units");
    System.out.println("getsurfaceArea() --> "+c4.surfaceArea() +" units");
    System.out.println("getVolume() --> "+c4.volume() +" units^2");
}
}


