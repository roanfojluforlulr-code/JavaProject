import java.util.*;

public class Work {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        class StudentRecode {
            String Name;
            String DateOfBirth;
            String Class;
            String Gender;
        }
        StudentRecode Student = new StudentRecode();
        Student.Name = "Ahmadsayed";
        Student.Class = " 5A ";
        Student.DateOfBirth = "21 March 2010";
        Student.Gender = " Male";
        System.out.println(Student.Name + Student.Class + Student.DateOfBirth + Student.Gender);
    }
}
