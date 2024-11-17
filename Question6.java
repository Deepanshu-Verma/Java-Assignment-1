package Assignment;
import java.awt.*;
import java.util.Scanner;

public class Question6 {
    public static void main(String [] args){
        Scanner T = new Scanner(System.in);
        System.out.println("Enter Num 1");
        double a = T.nextDouble();
        System.out.println("Enter Num 2");
        double b = T.nextDouble();

        System.out.println("Enter Operation:- 1(Add), 2(Subtract), 3(Multiply), 4(Divide)");
        int Choice = T.nextInt();
        double result;

        switch (Choice){
            case 1:
                result = a + b;
                System.out.println("Result" + result);
                break;
            case 2:
                result = a - b;
                System.out.println("Result" + result);
                break;
            case 3:
                result = a * b;
                System.out.println("Result" + result);
                break;
            case 4:
                result = a / b;
                System.out.println("Result" + result);
                break;

        }


    }
}