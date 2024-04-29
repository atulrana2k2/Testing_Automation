package resizeableShapes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Circle implements  Shape{


    private int circleId;

    private int  radius;

    public static List<Circle> circleList=new ArrayList<>();
    public  void addToCircleList(Circle circle) {
        circleList.add(circle);
    }

    public Circle(int circleId, int radius) {
        this.circleId = circleId;
        this.radius = radius;
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getCircleId() {
        return circleId;
    }

    public void setCircleId(int circleId) {
        this.circleId = circleId;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public static List<Circle> getCircleList() {
        return circleList;
    }

    public static void setCircleList(List<Circle> circleList) {
        Circle.circleList = circleList;
    }

    @Override
    public void resize() {


        Scanner scanner=new Scanner(System.in);
        System.out.println("Value of previous radius : "+getRadius());
        System.out.println("Enter the value of new  radius : ");
        radius=scanner.nextInt();
        System.out.println("Circle is resized successfully");


            }


}


