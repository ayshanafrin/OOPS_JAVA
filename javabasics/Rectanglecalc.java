package javabasics;
import java.util.Scanner;

public class Rectanglecalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        double length = sc.nextDouble();
        System.out.print("Enter the width: ");
        double width = sc.nextDouble();
        double rectArea = length * width;
        double rectPeri = 2 * (length + width);

        System.out.printf("Area of the rectangle: %.2f%n", rectArea);
        System.out.printf("Perimeter of the rectangle: %.2f%n", rectPeri);

        sc.close();
    }
}
