/**
 * Bradley Phan
 * September 23th 2024
 * Problem set 2A
 */

public class Circle{

double radius; //instance variable 
double circumference;
double area;

Circle(){
//default constructor 
radius = 1;
}

Circle(double r){
radius = r;

}
//bahaviour methods
public String toString(){
  return "Hello, I am a circle with a radius of " + radius;
}
public double getRadius(){
return radius;
}
public double circumference(){
circumference = radius * 2 * 3.14;
return circumference;
}
public double area(){
area = radius * radius * 3.14;
return area;
}

}
