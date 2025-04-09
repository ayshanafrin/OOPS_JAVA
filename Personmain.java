import java.util.Scanner;
class Person {
    
    String name;
    String gender;
    String address;
    int age;

    public Person(String nm,String g,String add,int ag){
        this.name=nm;
        this.gender=g;
        this.address=add;
        this.age=ag;
    }

}
 class Employeee extends Person{
    int empid;
    String compnm;
    String Qualf;
    double sal;

    public Employeee( String nm,String g,String add,int ag,int id,String cnm,String qlf,double s){
        super(nm, g, add, ag);
        this.empid=id;
        this.compnm=cnm;
        this.Qualf=qlf;
        this.sal=s;
    }


}

class Teacher extends Employeee{
    int trid;
    String sub;
    String dept;
     
    public Teacher(String nm,String g,String add,int ag,
    int id,String cnm,String qlf,double s,int tid,
    String subj,String det){
        super(cnm,g,add,ag,id,nm,qlf,s);
        this.trid=tid;
        this.sub=subj;
        this.dept=det;
    }
   
    public void display(){

        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + empid);
        System.out.println("Company Name: " + compnm);
        System.out.println("Qualification: " + Qualf);
        System.out.println("Salary: " + sal);
        System.out.println("Subject: " + sub);
        System.out.println("Department: " + dept);
        System.out.println("Teacher ID: " + trid);
        System.out.println("************************************************************");

    }

}

public class Personmain {
    public static void main(String[] args) {
        
        Teacher[] teachers = new Teacher[2];
        teachers[0] = new Teacher("Manu", "Male", "Ekm Vandoorkavy 568908", 28, 101,"ABC School", "MSc", 20000, 200, "CS","cs");
        teachers[1] = new Teacher("Amy", "Feale", "Minuvaka ahlem thiroor 678768", 30,103, "XYZ School", "PhD", 40000,  205, "stati","maths");

        for (Teacher teacher : teachers) {
            teacher.display();
        }

    }
    
}