import java.util.Scanner;

public class EmployeeSal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        
        System.out.println("Enter your designation (Manager/Developer/Intern): ");
        String designation = sc.nextLine().toLowerCase(); 

        
        System.out.println("Enter years of experience: ");
        int experience = sc.nextInt();

        int baseSalary = 0;
        double bonus = 0;

        
        if (designation.equals("manager")) {
            baseSalary = 50000;
        } else if (designation.equals("developer")) {
            baseSalary = 30000;
        } else if (designation.equals("intern")) {
            baseSalary = 15000;
        } else {
            System.out.println("Invalid designation! Please enter Manager, Developer, or Intern.");
        }

        
        if (baseSalary > 0) {
           
            if (experience >= 3 && experience <= 5) {
                bonus = baseSalary * 0.10; 
            } else if (experience > 5) {
                bonus = baseSalary * 0.20; 
            }

            double totalSalary = baseSalary + bonus;

            System.out.println("\nBase Salary: " + baseSalary);
            System.out.println("Bonus: " + bonus);
            System.out.println("Total Salary: " + totalSalary);
        }

        sc.close(); 
    }
}
