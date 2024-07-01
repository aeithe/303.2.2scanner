import java.util.Scanner;
//here is where the import for the scanner comes in
public class Main {
    public static void main(String[] args) {
        //scanner opens here, and in the "console window" it's expecting a string and then a
        //number, in that format exactly - it will give you an error code if you input something else
        //scanner is working as intended
        Scanner scanner = new Scanner(System.in);
        String myString = scanner.next();
        int myInt = scanner.nextInt();
        scanner.close();

        System.out.println("my string is: " +myString);
        System.out.println("my int is: " +myInt);
    }
}