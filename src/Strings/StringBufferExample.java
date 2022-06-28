package Strings;

public class StringBufferExample {
    public static void main(String[] args) {

        StringBuffer name = new StringBuffer("John Doe ");

        int nameLength = name.length();

        int nameCapacity = name.capacity();

        System.out.println("length of string " + nameLength);
        System.out.println();

        System.out.println("Capacity of string " + nameCapacity);
        System.out.println();

        System.out.println(name.append("is a java developer"));
        System.out.println();

        nameLength = name.length();

        nameCapacity = name.capacity();

        System.out.println("length of string " + nameLength);
        System.out.println();

        System.out.println("Capacity of string " + nameCapacity);
        System.out.println();
    }
}
