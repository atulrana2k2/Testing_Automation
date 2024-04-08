import java.util.Scanner;

public class Overloading_Example {

    public static int area(int side){
        return side*side;
    }

    public static int area(int length,int width){
        return length*width;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the side to calculate the area : ");
        int side=scanner.nextInt();

        System.out.println("Area is : "+area(side));

        System.out.println("Enter the length  and width to calculate the area : ");
        
        int length=scanner.nextInt();
        int width=scanner.nextInt();

        System.out.println("Area is : "+area(length,width));

    }
}
