import java.util.Scanner;

public class MainStudInfo {
    public static void main(String[] args) throws Exception {
        
        Student stud = new Student("Mark", "Perez", "Reyes", "BSIT", "Male", 202301);
        Student stud1 = new Student("Liza", "Cruz", "Santos");
        Student stud2 = new Student();

        System.out.println(stud.FirstName + " " + stud.LastName);
        System.out.println(stud1.FirstName);
        System.out.println(stud1.StudentNo);
        System.out.println(stud2.Gender);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student's First Name: ");
        String stud3FName = sc.nextLine();
        System.out.print("Enter Student's Middle Name: ");
        String stud3MName = sc.nextLine();
        System.out.print("Enter Student's Last Name: ");
        String stud3LName = sc.nextLine();
        System.out.print("Enter Student's Degree: ");
        String stud3Degree = sc.nextLine();
        System.out.print("Enter Student's Gender: ");
        String stud3Gender = sc.nextLine();
        System.out.print("Enter Student's Student Number: ");
        int stud3StudentNo = sc.nextInt();

        // Student stud = new Student(stud3FName, stud3MName, stud3LName, stud3Degree, stud3Gender, stud3StudentNo);

        System.out.println(stud2.FirstName + " " + stud2.MiddleName + " " + stud2.LastName);
        System.out.println(stud2.Degree);
        System.out.println(stud2.Gender);
        System.out.println(stud2.StudentNo);
        
        sc.close();
    }
}
