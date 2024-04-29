package resizeableShapes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Triangle  implements Shape{

    private int triangleId;

    private int side1;
    private int side2;
    private int side3;

  public static   List<Triangle> triangleList =new ArrayList<>();

    public Triangle(int triangleId, int side1, int side2, int side3) {
        this.triangleId = triangleId;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public int getTriangleId() {
        return triangleId;
    }

    public void setTriangleId(int triangleId) {
        this.triangleId = triangleId;
    }

    public int getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public int getSide3() {
        return side3;
    }

    public void setSide3(int side3) {
        this.side3 = side3;
    }

    public static List<Triangle> getTriangleList() {
        return triangleList;
    }

    public static void setTriangleList(List<Triangle> triangleList) {
        Triangle.triangleList = triangleList;
    }


    @Override
    public  void resize() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Value of previous triangle : " +
                "\nside1 : "+getSide1()+
                "\nside2 : "+getSide2()+
                "\nside3 : "+getSide3() );


        System.out.println("Enter the value of side 1 : ");
        side1=scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the value of side 2 : ");
        side2=scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the value of side 3 : ");
        side3=scanner.nextInt();
        scanner.nextLine();

        System.out.println("Triangle is resized successfully");

    }




}
