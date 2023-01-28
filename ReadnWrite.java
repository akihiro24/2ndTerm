import java.io.*;
import java.util.Scanner;

public class ReadnWrite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("UserPass.txt"));
            String line = reader.readLine();
            while (line != null) {
                String[] parts = line.split(" ");
                if (parts[0].equals(username) && parts[1].equals(password)) {
                    System.out.println("Successfully entered the program");
                    return;
                }
                line = reader.readLine();
            }
            System.out.println("Invalid Username or Password");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
