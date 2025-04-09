abstract class Employee {
    String name;
    int id;
    

    Employee(String nm,int Id){
        this.name=nm;
        this.id=Id;
    }
    abstract void calculateSalary();
}
   //class fulltime extends from here..
   class FulltimeEmployee extends Employee {
    
      double msal;

      FulltimeEmployee(String nm,int Id,double salary){
          super(nm, Id);
          this.msal=salary;
      }
    
      @Override
      void calculateSalary(){
        double basic=4000;
        double msall=msal+basic;
        System.out.println("Full-Time Employee Salary: " + msall);
      }
}

//class partime starts from here
class PartimeEmployee extends Employee {
    
    double rate;
    double tot_hr;

    PartimeEmployee(String nm,int Id,double rat,double hr){
        super(nm, Id);
        this.rate=rat;
        this.tot_hr=hr;
    }
   
    @Override
    void calculateSalary(){
      double s= rate * tot_hr;  
      System.out.println("Half-Time Employee Salary: " + s);
    }
}

public class Employ {
    public static void main(String[] args) {
        FulltimeEmployee fe= new FulltimeEmployee("Anu", 0200, 10000);
        PartimeEmployee pe = new PartimeEmployee("minu", 210, 1000, 2);
        fe.calculateSalary();
        pe.calculateSalary();
    }

    
}