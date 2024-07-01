import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String myString = scanner.next();
        int myInt = scanner.nextInt();
        myString = "Hi";
        myInt = 5;
        scanner.close();

        System.out.println("my string is: " +myString);
        System.out.println("my int is: " +myInt);
    }
}