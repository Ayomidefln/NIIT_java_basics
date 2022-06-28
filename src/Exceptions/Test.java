package Exceptions;

public class Test {
    public static void main(String[] args) {
        try {
            int num = 0;
            int num2 = 10;
            int result = num2 / num;
            System.out.println(result);
        }

        catch (Exception e) {
            System.out.println("This is the end of the program");
        }
    }
}
