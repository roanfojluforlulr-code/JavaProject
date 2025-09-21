import java.util.Scanner;

class StudentWork {

    Scanner object = new Scanner(System.in);
    String student_name;
    String student_age;
    String student_class;

    void study() {
        System.out.println("What subject you want to learn?");
        String subject = object.next();
        System.out.println("Great! You have chosen to study: " + subject);
    }

    void closeScanner() {
        object.close();
    }
}

public class Student {
    public static void main(String[] args) {
        StudentWork student_1 = new StudentWork();

        student_1.student_name = "Gallry";
        student_1.student_age = "17";
        student_1.student_class = "5-2A";

        System.out.println("Your name is:" + student_1.student_name);
        System.out.println("Your age is:" + student_1.student_age);
        System.out.println("Your class is:" + student_1.student_class);

        student_1.study();
        student_1.closeScanner();
    }
}