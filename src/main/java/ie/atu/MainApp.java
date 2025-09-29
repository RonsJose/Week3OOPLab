package ie.atu;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

       System.out.println("Basic calculator\n");
        System.out.println("Enter 1st number: ");
        int FirstNumber=scan.nextInt();
        System.out.println("Enter 2nd number: ");
        int SecondNumber=scan.nextInt();

       System.out.println("Please pick one of the options:\n\n1. Addition\n2. Subtraction\n3.Multiplication\n");
       int operation=scan.nextInt();
        Calculator calc=new Calculator();

       double result=switch(operation)
        {
            case 1 -> {
                yield calc.add(FirstNumber,SecondNumber);
            }
            case 2 ->{
                yield calc.sub(FirstNumber,SecondNumber);
            }
            case 3->{
                yield calc.mul(FirstNumber,SecondNumber);
            }
            default -> {
              System.out.println("Invalid input");
              yield 0;
            }
        };

       System.out.println("\nThe answer is: "+result);

        scan.close();
    }
}
