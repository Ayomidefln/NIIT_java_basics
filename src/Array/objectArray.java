package Array;

public class objectArray {
    public static void main(String[] args) {
     NIIT [] student = new NIIT[3];
     student[0] = new NIIT("Kayla", 17);
     student[1] = new NIIT("Cross", 20);
     student[2] = new NIIT("Edward", 18);

     for (NIIT i : student){
         System.out.println("Student Name: " + i.studentName);
         System.out.println("Student Age: " + i.studentAge);
     }
    }
}
