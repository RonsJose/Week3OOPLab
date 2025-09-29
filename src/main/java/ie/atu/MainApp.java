package ie.atu;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("\n\nSimple Calculator\nAdd two number\n");
        System.out.println("Enter 1st number: ");
        int FirstNumber=scan.nextInt();
        System.out.println("Enter 2nd number: ");
        int SecondNumber=scan.nextInt();

        Calculator calc=new Calculator();
        int result=calc.add(FirstNumber,SecondNumber);
        System.out.println("The result is: "+result);
        scan.close();
    }
}
