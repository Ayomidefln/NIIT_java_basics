package Enums;

public enum enumClass {
    //Using Weeks now
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY;

    void run(){
        switch (this){
            case MONDAY:
                System.out.println("No Java class");
                break;
            case TUESDAY:
                System.out.println("First Java class of the week");
                break;
            case WEDNESDAY:
                System.out.println("Assignments from Java class");
                break;
            case THURSDAY:
                System.out.println("Second Java class of the week");
                break;
            default:
                System.out.println("Please, give us many assignment for the weekend");
                break;
        }

    }

    public static void main(String[] args) {
//        enumClass.THURSDAY.run();
        System.out.println(enumClass.MONDAY.hashCode());
        System.out.println(enumClass.MONDAY.compareTo(enumClass.FRIDAY));
    }

}
