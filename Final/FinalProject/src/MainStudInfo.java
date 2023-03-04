import java.util.Scanner;

public class MainStudInfo {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter student degree: ");
        String degree = sc.nextLine();
        
        System.out.print("Enter student year level: ");
        String yearLevel = sc.nextLine();
        
        System.out.print("Enter student first name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter student middle name: ");
        String middleName = sc.nextLine();

        System.out.print("Enter student last name: ");
        String lastName = sc.nextLine();

        System.out.print("Enter student gender: ");
        String gender = sc.nextLine();
        
        Student Student = new Student(degree, yearLevel, firstName, middleName, lastName, gender);
        System.out.println("Student Record: " + Student.toString());

        sc.close();
    }

}

