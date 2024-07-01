import java.util.Scanner;

public class partTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstInt = scanner.nextInt();
        double secondDouble = scanner.nextDouble();
        String firstString = scanner.next();
        scanner.close();

        System.out.println("my integer is: " +firstInt);
        System.out.println("my double is: " +secondDouble);
        System.out.println("my string is: "+ firstString);

    }
}
