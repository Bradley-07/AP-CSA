        /**
 * Bradley Phan
 * Oct 1 2024
 * Problem Set 2C
*/


public class orderedPair{
double x; 
double y;


public orderedPair(){
x= 0;
y=0;
}

public orderedPair(double a){
x= a;
}

public orderedPair(double a, double b){
x = a;
y = b;
}

public String toString(){
return "("+ x + ","+ y + ")";

}

public double getX(){
return x;
}

public double getY(){
return y;
}


}