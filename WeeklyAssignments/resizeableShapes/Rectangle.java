package resizeableShapes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Rectangle implements  Shape{

    private  int rectangleID;

    private  int Length;

    private int Breadth;

    public static   List<Rectangle> rectangleList =new ArrayList<>() ;



    public Rectangle(int rectangleID, int length, int breadth) {
        this.rectangleID = rectangleID;
        Length = length;
        Breadth = breadth;
    }

    public int getRectangleID() {
        return rectangleID;
    }

    public void setRectangleID(int rectangleID) {
        this.rectangleID = rectangleID;
    }

    public int getLength() {
        return Length;
    }

    public void setLength(int length) {
        Length = length;
    }

    public int getBreadth() {
        return Breadth;
    }

    public void setBreadth(int breadth) {
        Breadth = breadth;
    }

    public static List<Rectangle> getRectangleList() {
        return rectangleList;
    }

    public void setRectangleList(List<Rectangle> rectangleList) {
        this.rectangleList = rectangleList;
    }

    @Override
    public void resize() {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Value of previous length : "+getLength()
        +"\nValue of previous breadth : "+getBreadth());


                System.out.println("Enter the value new Length : ");
                setLength(scanner.nextInt());
                scanner.nextLine();

                System.out.println("Enter the value of new Breadth : ");
                setBreadth(scanner.nextInt());
                scanner.nextLine();

                System.out.println("Rectangle is resized successfully");






    }



}
