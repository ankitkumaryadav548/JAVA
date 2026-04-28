import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("You are reading line from content");

        while (true) {
            String line = sc.nextLine();

            if ("exit".equalsIgnoreCase(line)) {
                break;
            }

            System.out.println("You entered: " + line);
        }

        sc.close();
    }
}