package Array;

public class NIIT {
    String studentName;
    int studentAge;

    public NIIT(String Name, int Age) {
        this.studentName = Name;
        this.studentAge = Age;
    }

    public NIIT(String Name) {
        this.studentName = Name;
    }

    public NIIT() {
    }

    public void run() {
        System.out.println(studentName);
        System.out.println(studentAge);
    }

    public static void main(String[] args) {
        NIIT student = new NIIT("Michaela", 17);
        student.run();
    }

}
