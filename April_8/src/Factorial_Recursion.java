import java.util.Scanner;

public class Factorial_Recursion {

    public static int factorial(int number)
    {
        if(number==1 || number==0)
            return 1;
        else
            return number*factorial(number-1);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number=scanner.nextInt();

        System.out.println("Factorial is :"+factorial(number));

    }
}
