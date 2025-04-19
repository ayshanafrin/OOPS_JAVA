package cycle1;
public class Studentc {
    
    int studentId;
    String name;
    double marks;


    public Studentc(int stid,String nam,double mk)
    {
      studentId=stid;
      name=nam;
      marks=mk;
    }

    void displayDetails()
    {
        System.out.println("StudentId: "+studentId);
        System.out.println("StudentName: "+ name);
        System.out.println("marks: "+marks);
        
    }

    void isPassed()
    {
        if (marks>40){
          System.out.println("The student Pssed");
          System.out.println("\n");
        }
        else{
           System.out.println("The Student Failed"); 
           System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        Studentc st= new Studentc(101, "Nourin", 80);
        Studentc st1= new Studentc(102, "amrith", 35);

        st.displayDetails();
        st.isPassed();
        st1.displayDetails();
        st1.isPassed();
    }
}

