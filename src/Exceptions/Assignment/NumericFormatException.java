package Exceptions.Assignment;

import java.util.Scanner;

public class NumericFormatException {
    public static void main(String[] args) {

        try{
            Scanner input = new Scanner(System.in);
            System.out.println("Enter Number Only: ");
            int Number = input.nextInt();

            if (Number >= 18){
                System.out.println("You are an adult");
            }

            else{
                System.out.println("You are too young");
            }
        }
        catch (Exception e){
            System.out.println("Please input Numbers only");
        }

    }

}
