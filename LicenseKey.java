import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class LicenseKey {
    public static void main(String[] args) {

        boolean keyAccepted = false;
        while (!keyAccepted) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the license key: ");
        String key = scanner.nextLine();

        String pattern = "128-237664-22";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(key);

        if (m.matches()) {
            System.out.println("License Key Accepted.");
            break;
        } else {
            System.out.println("Invalid Key, Try Again!");
        }
        
    }

    }
}
