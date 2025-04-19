package javabasics;
import java.util.Scanner;

public class Circlecalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double r = sc.nextDouble();

        double circleArea = 3.14159 * r * r;
        double circleCircumference = 2 * 3.14159 * r;

        System.out.printf("Area of the circle: %.2f%n", circleArea);
        System.out.printf("perimeter of the circle: %.2f%n", circleCircumference);

        sc.close();
    }
}
