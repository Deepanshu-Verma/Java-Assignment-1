package Assignment;
import java.util.Scanner;

public class Question4_b {
    public static void main(String [] args){
        Scanner T = new Scanner(System.in);
        System.out.println("Enter Number To Check Whether is Odd or Even");
        int num = T.nextInt();
        if(num % 2 == 0){
            System.out.println(num + " Is Even");
        }else{
            System.out.println(num + " Is Odd");
        }

    }

}
