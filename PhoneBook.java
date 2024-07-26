import java.rmi.server.UID;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Menu");
            System.out.println("1.Add your number");
            System.out.println("2.Print all of the names and numbers");
            System.out.println("3.Exit");
            System.out.println("Enter your choice:");
            Scanner scanner = new Scanner(System.in);
            String UserInput = scanner.nextLine();
            if (UserInput.equals("1")) {
                System.out.println("what is your name?  ");
                String UserName = scanner.nextLine();
                System.out.println("what is your  phone number?");
                String Number = scanner.nextLine();
            }
            if (UserInput.equals("2")) {
                System.out.println("print all names and  phone numbers");
            }
            if (UserInput.equals("3")) {
                System.out.println("Exit");
                System.exit(0);
            }
        }
    }
}
