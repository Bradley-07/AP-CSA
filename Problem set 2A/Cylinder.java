/**
 * Bradley Phan
 * Sep 24th 2024
 * Problem Set 2A
 */

public class Cylinder{
    double height;
    Circle base; 
    double surfarea;
    double volume;
    
    
    Cylinder(){
    height = 1;
    base = new Circle(1);
    
    }
    
    Cylinder(double r,double h ){
    base = new Circle(r);
    height = h;
    
    }
    
    public String toString(){
    return "Hello I am a circle with a radius of "+ base.getRadius() + " units and a height of "+ height +" units";
    }
    
    public double getRadius(){
    return base.getRadius();
    }
    
    public double getHeight(){
    return height;
    }
    public double surfaceArea(){
    surfarea = (2 * 3.14 * base.getRadius()* height) + (2 * 3.14 * base.getRadius() * base.getRadius());
    return surfarea;
    
    
    }
    public double volume(){
    volume = 3.14 * base.getRadius() * base.getRadius() * height;
    return volume;
    }
    
    
    
    


}