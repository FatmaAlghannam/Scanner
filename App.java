import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter the year here :");
        Scanner reads = new Scanner(System.in);
        int year = reads.nextInt();

        boolean leap = false;

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " leap year ");
        } else {
            System.out.println(year + "not leap year");
        }
        reads.close();

    }

}
