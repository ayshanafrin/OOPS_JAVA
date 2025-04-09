interface Shape{
 
     double calculateArea();
}

class Triangle implements Shape {

    double base, height;

    Triangle(double base, double height){
        this.base=base;
        this.height=height;
    }

    public double calculateArea() {
        return 0.5*base*height;
    }

 }

 class Rectangle implements Shape {

    double length, breadth;

    Rectangle(double length, double breadth){
        this.length=length;
        this.breadth=breadth;
    }

    public double calculateArea() {
        return length*breadth;
    }

 }




public class Shape1 {
    public static void main(String[] args) {
        Shape s1 = new Triangle(5,4);
        Shape s2 = new Rectangle(4,5);

        System.out.println("Area of Triangle:"+s1.calculateArea());
        System.out.println("Area of rectangle:"+s2.calculateArea());
    }

    
}
