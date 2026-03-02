// Program to print multiplication table from 6 to 9
import java.util.Scanner;

class LEVEL2ii {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Enter number: ");
        number = input.nextInt();

        for (int i = 6; i <= 9; i++) {
            int result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }

        input.close();
    }
}