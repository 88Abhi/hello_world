import java.util.*;

class calculator
{
    public static int addition(int number1, int number2)
    {
        return number1 + number2;
    }
    public static int substraction(int number1, int number2)
    {
        return number1 - number2;
    }
    public static int multiply(int number1, int number2)
    {
        return number1 * number2;
    }
    public static void main(String [] args)
    {
        System.out.println("Welcome to the calculator");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int sum = addition(num1, num2);
        int sub = substraction(num1, num2);
        int mul = multiply(num1, num2);
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
        System.out.println("The difference of " + num1 + " and " + num2 + " is " + sub);
        System.out.println("The multiplication of " + num1 + " and " + num2 + " is " + mul);
        
    }
}