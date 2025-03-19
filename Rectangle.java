public class Rectangle {
    double length;
    double width;

    public Rectangle(double len,double widt)
    {
      length=len;
      width=widt;
    }
    
    void calculateArea()
    {
        double area;
        area= length * width;
        System.out.println("The are of Rectangle is: $"+area);
    }
   
    void calculatePerimeter()
    {
        double Peri;
        Peri= 2*(length * width);
        System.out.println("The Perimeter of Rectangle is: $"+Peri);
    }
 
    public static void main(String[] args) {
        {
            Rectangle rc= new Rectangle(5, 06);

            rc.calculateArea();
            rc.calculatePerimeter();
        }
    }
}
