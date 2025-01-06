import java.util.*;

class calculator
{
    public static int addition(int number1, int number2)
    {
        return number1 + number2;
    }
    public static void main(String [] args)
    {
        System.out.println("Welcome to the calculator");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int sum = addition(num1, num2);
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
    }
}