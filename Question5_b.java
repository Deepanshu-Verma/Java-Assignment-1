package Assignment;
import java.util.Scanner;

public class Question5_b {
    public static void main(String [] args){
        Scanner T = new Scanner(System.in);
        System.out.println("Enter 3 Numbers to find Largest between them");
        int a = T.nextInt();
        int b = T.nextInt();
        int c = T.nextInt();

        if( a > b && a > c){
            System.out.println(a + " Is Largest Between Them");
        } else if (b > a && b > c) {
            System.out.println(b + " Is Largest Between Them");
        }else{
            System.out.println(c + " Is Largest Between Them");
        }

    }
}