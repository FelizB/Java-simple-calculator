package com.simplecalculator;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
	// write your code here
        //ask for a number
      Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number ");
        double number1= in.nextDouble();

        //ask for an operator
        Scanner symbol= new Scanner(System.in);
        System.out.print("Enter an operator i.e(+, -, *, /)  ");
        char operator= symbol.next().charAt(0);



        //ask for the next number
      Scanner number= new Scanner(System.in);
        System.out.print("Enter the number to substitute: ");
        double number2 = number.nextDouble();

        double result;

        switch (operator)
        {
            case '+':
                result= number1 + number2;
                break;
            case '-':
                result= number1 - number2;
                break;
            case '*':
                result= number1 * number2;
                break;
            case '/':
                result= number1 / number2;
                break;

            // in a case the operator doesn't match the result of the operations
            default:
                System.out.printf("Error!!");
                return;
        }

        System.out.printf("%.1f %c %.1f = %.1f", number1,operator,number2,result);


        }
}
