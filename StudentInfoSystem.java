abstract class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void displayDetails();
}

class Student extends Person {
    private int rollNumber;

    public Student(String name, int age, int rollNumber) {
        super(name, age);
        this.rollNumber = rollNumber;
    }

    @Override
    public void displayDetails() {
        System.out.println("Student Details: Name: " + name + " Age: " + age + " Roll Number: " + rollNumber);
    }
}

class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void displayDetails() {
        System.out.println("Teacher Details: Name: " + name + " Age: " + age + " Subject: " + subject);
    }
}

public class StudentInfoSystem {
    public static void main(String[] args) {
        Student s = new Student("Alice", 20, 101);
        Teacher t = new Teacher("Mr. Smith", 40, "Mathematics");

        s.displayDetails();
        t.displayDetails();
    }
}
