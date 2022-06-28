package Conditional_Construct;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter age between 6-17");
        int age = input.nextInt();

        switch (age) {
            case 6:
                System.out.println("Primary 1");
                break;
            case 7:
                System.out.println("Primary 2");
                break;
            case 8:
                System.out.println("Primary 3");
                break;
            case 9:
                System.out.println("Primary 4");
                break;
            case 10:
                System.out.println("Primary 5");
                break;
            case 11:
                System.out.println("Primary 6");
                break;
            case 12:
                System.out.println("JSS 1");
                break;
            case 13:
                System.out.println("JSS 2");
                break;
            case 14:
                System.out.println("JSS 3");
                break;
            case 15:
                System.out.println("SSS 1");
                break;
            case 16:
                System.out.println("SSS 2");
                break;
            case 17:
                System.out.println("SSS 3");
                break;
            default:
                System.out.println("You be fool");
        }
    }
}
