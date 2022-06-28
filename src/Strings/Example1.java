package Strings;

public class Example1 {
    public static void main(String[] args) {
        String name = "John Doe";
        String name2 = new String("Kayla Doe");

        System.out.println("First String "+ name);
        System.out.println("Second String " + name);

        String convert = name2.intern();
        System.out.println(convert);

        //length()

        System.out.println(name.length());

        System.out.println(name.charAt(4));

        System.out.println(name.concat(name2));
    }
}
