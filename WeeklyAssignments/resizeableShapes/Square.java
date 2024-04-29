package resizeableShapes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Square implements Shape{


    private int squareID;
    private int side;


   public static List<Square> squareList=new ArrayList<>();

    public Square(int squareID, int side) {
        this.squareID = squareID;
        this.side = side;
    }

    public static void addToSquareList(Square square) {
        squareList.add(square);
    }

    public int getSquareID() {
        return squareID;
    }

    public void setSquareID(int squareID) {
        this.squareID = squareID;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public static List<Square> getSquareList() {
        return squareList;
    }

    public static void setSquareList(List<Square> squareList) {
        Square.squareList = squareList;
    }

    @Override
    public void resize() {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Value of previous side : "+getSide());
        System.out.println("Enter the value of side : ");
        side=scanner.nextInt();
        System.out.println("Square is resized successfully");

    }

}
