import java.util.Scanner;

class StudentRecord {

    String name;
    String address;
    int age;

    //Method
    public void sayMyName() {
        System.out.println("Student Name: " + name);
    }
    public void sayMyAddress() {
        System.out.println("Address: " + address);
    }
    public void sayMyAge() {
        System.out.println("Age: " + age);
    }

    // Constructor
    public StudentRecord(String studentName, String studentAddress, int studentAge) {
        name = studentName;
        address = studentAddress;
        age = studentAge;
    }

    public static void main(String[] Args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String stName = sc.nextLine();
        System.out.print("Enter Student Address: ");
        String stAddress = sc.nextLine();
        System.out.print("Enter Student Age: ");
        int stAge = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        System.out.println(" ");
        System.out.print("Enter Student Name: ");
        String stName1 = sc1.nextLine();
        System.out.print("Enter Student Address: ");
        String stAddress1 = sc1.nextLine();
        System.out.print("Enter Student Age: ");
        int stAge1 = sc1.nextInt();

        System.out.println(" ");
        System.out.println("Record of the Students:");
        System.out.println(" ");
        StudentRecord st1 = new StudentRecord("Jackson", "Pasig City", 20);
        st1.sayMyName();
        st1.sayMyAddress();
        st1.sayMyAge();
        
        System.out.println(" ");
        StudentRecord st2 = new StudentRecord("John", "Mandaluyong", 21);
        st2.sayMyName();
        st2.sayMyAddress();
        st2.sayMyAge();

        System.out.println(" ");
        StudentRecord st3 = new StudentRecord("Mark", "Metro Manila", 22);
        st3.sayMyName();
        st3.sayMyAddress();
        st3.sayMyAge();
     
        System.out.println(" ");
        System.out.println("Student Name: " + stName);
        System.out.println("Address: " + stAddress);
        System.out.println("Address: " + stAge);

        System.out.println(" ");
        System.out.println("Student Name: " + stName1);
        System.out.println("Address: " + stAddress1);
        System.out.println("Address: " + stAge1);


        sc.close();
        sc1.close();
    }
}