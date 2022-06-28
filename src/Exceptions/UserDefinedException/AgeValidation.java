package Exceptions.UserDefinedException;

public class AgeValidation extends RuntimeException {
    public AgeValidation(){
        System.out.println("Invalid Age");
        System.out.println("Only Age greater than zero can be entered");
    }
}
