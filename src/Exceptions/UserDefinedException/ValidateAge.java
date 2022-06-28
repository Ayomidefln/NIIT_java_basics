package Exceptions.UserDefinedException;

import java.util.Scanner;

public class ValidateAge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Age");
        int age = input.nextInt();

        if (age <= 0) {
            try {
                throw new AgeValidation();

            } catch (Exception e) {
                System.out.println("Exception Raised");
            }
        } else {
            System.out.println("Your age is " + age);
        }

    }

}
