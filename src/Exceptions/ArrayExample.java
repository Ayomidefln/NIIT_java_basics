
package Exceptions;

public class ArrayExample {
    public static void main(String[] args) {
       try{
           int num []= new int[5] ;
           num[0]=1;
           num[1]=2;
           num[2]=3;
           num[3]=4;
           num[4]=5;
           System.out.println(num[6]);
       }
       catch (Exception e){
           System.out.println("Na index 1 - 5 Ode");
       }
    }
}
