package Assignment;
import java.util.Scanner;

public class Question3{
    public static void main(String[] args){
        Scanner T = new Scanner(System.in);
        System.out.println("Enter Two Values");
        int a = T.nextInt();
        int b = T.nextInt();
        System.out.println("Before swap: a = " + a + ", b = " + b);

        int c = a;
        a = b;
        b = c;
        System.out.println("Before swap: a = " + a + ", b = " + b);

    }
}