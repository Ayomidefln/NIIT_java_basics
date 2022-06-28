package Array;


import java.util.Scanner;

public class TwoDAssignment {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int count = input.nextInt();

        int[] number = new int[count];

        for (int i = 0; i < number.length; i++) {
            System.out.print(">>> ");
            number[i] = input.nextInt();
        }

        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }

        for (int num: number) {
            System.out.print(num);
        }

    }

}