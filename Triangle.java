import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Triangle {
    public static void main(String[] args) {
        String fileName = "triangle.txt";
        int rows = 4; // number of rows

        try {
            PrintWriter write = new PrintWriter(new File(fileName));

            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= rows - i; j++) {
                    write.print(" ");
                }
                for (int k = 1; k <= i; k++) {
                    write.print("* ");
                }
                write.println();
            }
            write.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error Creating File: " + e.getMessage());
        }
    }
}
