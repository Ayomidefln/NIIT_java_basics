package Conditional_Construct;

public class Example1 {
    public static void main(String[] args) {
        int Age = 18;
        String maleGender = "Male";
        String femaleGender = "Female";
        if (Age<18 && maleGender == "Male"){
            System.out.println("Small boy you can't drive");
        }
        else if (Age<18 && femaleGender == "Female"){
            System.out.println("Small girl you  can't drive");
        }
        else if (maleGender =="Female" || femaleGender == "Male"){
            System.out.println("Ewww!!! Nigga you gay!");
        }
        else{
            System.out.println("You are free to drive");
        }
    }
}
