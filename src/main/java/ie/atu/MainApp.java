package ie.atu;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

       System.out.println("Basic calculator\n");

       //Getting the numbers
        System.out.println("Enter 1st number: ");
        int FirstNumber=scan.nextInt();
        System.out.println("Enter 2nd number: ");
        int SecondNumber=scan.nextInt();

        //Getting operator
       System.out.println("Please pick one of the options:\n\n1. Addition\n2. Subtraction\n3.Multiplication\n4.Division\n5.Power\n6.Modulo");
       int operation=scan.nextInt();
        Calculator calc=new Calculator();

        //Depending on operator calling the class using object calc and using the specified method
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
            case 4 ->{
                //Checking for divide by 0 error
                if(SecondNumber==0)
                {
                    System.out.println("Can't divide by zero");
                    yield 0;
                }
                else
                {
                    yield calc.div(FirstNumber,SecondNumber);
                }
            }
            case 5->
            {
                yield calc.power(FirstNumber,SecondNumber);
            }
            case 6 ->
            {
                yield calc.modulo(FirstNumber,SecondNumber);
            }
            default -> {
              System.out.println("Invalid input");
              yield 0;
            }
        };

       //Print out the answer
       System.out.println("\nThe answer is: "+result);

        scan.close();
    }
}
