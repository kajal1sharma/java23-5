class Student {
    static String collegeName = "UIM";
    static String principal = "MK mishra";
    String name;
    int standard;
    int fees;
    int marks;

    public static void staticPrint(String name) {
        System.out.println(name);
        System.out.println(collegeName);
        System.out.println("hello this is a static function");
    }

    public void NonStaticPrint() {
        System.out.println(name);
        System.out.println("hello this is non static function");
    }
}

// instance, local
public class Keystatic {
    static int a;
    int x;
    Car y;
    String s;

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student.principal = "tn mishra";
        Student.staticPrint(s1.name);
        s1.staticPrint();
        // Student.printNonStatic();
        // s1.principal = "nk singh";
        // System.out.println(Student.principal);
        // System.out.println(s1.principal);
        // Student s1 = new Student();

        // Student s2 = new Student();

        // Student s3 = new Student();

        // Student s4 = new Student();

        // local variables
        // int a;
        // float b;
        // // reference
        // Car2 ref;
        // System.out.println(ref);

    }
}
