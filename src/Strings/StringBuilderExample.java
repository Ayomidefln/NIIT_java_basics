package Strings;

public class StringBuilderExample {
    public static void main(String[] args) {
        /* ____constructor*/
        StringBuilder str = new StringBuilder();
        str.append("John");
        System.out.println("String: " +str.toString());

        /*____constructor*/
        StringBuilder str1 =  new StringBuilder("Java is a ");
        System.out.println("String1: "+str1.toString());

        /*____constructor*/
        StringBuilder str2 = new StringBuilder(10);
        System.out.println("String2 capacity: "+str2.capacity());

        /*____constructor*/
        StringBuilder str3 = new StringBuilder(str1.toString());
        System.out.println("String3: "+str3.toString());
    }
}
