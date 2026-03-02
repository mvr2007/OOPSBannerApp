// Program to check Leap Year
import java.util.Scanner;

class LEVEL3i {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int year;
        boolean isLeap;

        System.out.print("Enter year: ");
        year = input.nextInt();

        if (year >= 1582) {

            isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

            if (isLeap) {
                System.out.println(year + " is a Leap Year");
            } else {
                System.out.println(year + " is not a Leap Year");
            }

        } else {
            System.out.println("Year must be >= 1582");
        }

        input.close();
    }
}