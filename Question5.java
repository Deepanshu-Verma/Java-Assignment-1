package Assignment;
import java.util.Scanner;

public class Question5 {
    public static void main(String [] args){
        Scanner T = new Scanner(System.in);
        System.out.println("Enter 2 Numbers to Find Which One is Larger");
        int a = T.nextInt();
        int b = T.nextInt();
        if(a > b){
            System.out.println(a + " Is Larger");
        }else{
            System.out.println(b + " Is Larger");
        }
    }
}