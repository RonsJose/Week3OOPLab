package ie.atu;
import static java.lang.Math.*;

public class Calculator {
    //Method to add two numbers
    public int add(int FirstNum, int SecondNum)
    {
        return FirstNum + SecondNum;
    }

    //Method to subtract two numbers
    public int sub(int FirstNum, int SecondNum)
    {
        return FirstNum - SecondNum;
    }
    //Method to multiply two numbers
    public int mul(int FirstNum, int SecondNum)
    {
        return FirstNum * SecondNum;
    }
    //Method to divide two numbers
    public  int div(int FirstNum, int SecondNum)
    {
        return FirstNum / SecondNum;
    }

    //Method to use powers
    public int power(int base,int exponent)
    {
       return (int) pow(base,exponent);
    }

    //Method to get modulus
    public int modulo(int firstNum,int secondNum)
    {
        return firstNum%secondNum;
    }
}
