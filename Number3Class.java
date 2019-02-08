package Number3;
//Assignment 1 Exercise 3 for Intro to Java class (COSC 251  Sp 19 Sem)
import java.util.Scanner;

public class Number3Class {
    public static void main (String[] args){
     Scanner sc = new Scanner (System.in);

     int firstNum;
     System.out.println("Enter an integer: ");
     firstNum = sc.nextInt();

     int secondNum;
     System.out.println("Enter an integer: ");
     secondNum = sc.nextInt();

     int product;
     product = firstNum * secondNum;

     int sum;
     sum = firstNum + secondNum;

     int difference;
     difference = firstNum - secondNum;

     int quotient;
     quotient =firstNum / secondNum;

     System.out.println("The product of the two integers is: "+product);
     System.out.println("The sum of the two integers is: "+sum);
     System.out.println("The difference of the two integers is: "+difference);
     System.out.println("The quotient of the two integers is: "+quotient);


    }
}
