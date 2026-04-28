import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Do you want to continue? (yes/no): ");
        String answer = sc.nextLine();

        if ("yes".equalsIgnoreCase(answer)) {
            System.out.println("Continuing the program...");
        } else if ("no".equalsIgnoreCase(answer)) {
            System.out.println("Exiting the program...");
        } else {
            System.out.println("Invalid input!");
        }

        sc.close();
    }
}