package inheriance;

public class Person {
    static {
        System.out.println("Person: First Static Block");
    }

    static {
        System.out.println("Person: Second Static Block");
    }

    {
        System.out.println("Person: First Instance Initialization Block");
    }

    {
        System.out.println("Person: Second Instance Initialization Block");
    }

    public Person() {
        System.out.println("Person()");
    }

    public void sayHello() {
        System.out.println("Person: Hello!");
    }
}

class Employee extends Person {
    static {
        System.out.println("Employee: First Static Block");
    }

    static {
        System.out.println("Employee: Second Static Block");
    }

    {
        System.out.println("Employee: First Instance Initialization Block");
    }

    {
        System.out.println("Employee: Second Instance Initialization Block");
    }

    public Employee() {
        System.out.println("Employee()");
    }
}

class Instructor extends Employee {
    public static String str1 = "Explicit Initialization String";

    static {
        System.out.println("Instructor: First Static Block");
        str1 = "First Static Initialization String";
    }

    static {
        System.out.println("Instructor: Second Static Block");
        str1 = "Second Static Initialization String";
    }

    {
        System.out.println("Instructor: First Instance Initialization Block");
        str1 = "First Instance Initialization String";
    }

    {
        System.out.println("Instructor: Second Instance Initialization Block");
        str1 = "Second Instance Initialization String";
    }

    public Instructor() {
        System.out.println("Instructor()");
    }
}
