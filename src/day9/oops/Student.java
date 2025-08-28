package day9.oops;

//constructor overloading
//which can be achieved by differing parameter by no, type and order
public class Student {

    String studentName;
    int rollNo;

    public Student() {
        System.out.println("0 default constructor.");
    }

    public Student(String sName) {
        studentName = sName;
        System.out.println("1a parameterized constructor.");
    }

    public Student(int roll) {
        rollNo = roll;
        System.out.println("1b parameterized constructor.");
    }

    public Student(String sName, int roll) {
        studentName = sName;
        rollNo = roll;
        System.out.println("2a parameterized constructor.");
    }

    public Student(int roll, String sName) {
        rollNo = roll;
        studentName = sName;
        System.out.println("2b parameterized constructor.");
    }

    public void displayStudentInfo() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Roll No: " + rollNo);
    }

    public static void main(String[] args) {
        Student student1 = new Student("Ramesh", 1);
        student1.displayStudentInfo();

        System.out.println("=============");
        Student student2 = new Student();
        student2.displayStudentInfo();
    }
}
