package resizeableShapes;

import java.util.Scanner;


import static resizeableShapes.Circle.circleList;
import static resizeableShapes.Circle.getCircleList;
import static resizeableShapes.Rectangle.getRectangleList;
import static resizeableShapes.Square.getSquareList;
import static resizeableShapes.Square.squareList;
import static resizeableShapes.Triangle.getTriangleList;
import static resizeableShapes.Rectangle.rectangleList;
import static resizeableShapes.Triangle.triangleList;

public class Main {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);


        //taking Circles in the system
        Circle circle1 = new Circle(1,5);
        circleList.add(circle1);

        Circle circle2 = new Circle(2,4);
        circleList.add(circle2);

        Circle circle3 = new Circle(3,6);
        circleList.add(circle3);


        //taking triangles in the system
        Triangle triangle1 = new Triangle(1,5,7,1);
        triangleList.add(triangle1);

        Triangle triangle2 = new Triangle(2,5,7,3);
        triangleList.add(triangle2);

        Triangle triangle3 = new Triangle(3,6,5,1);
        triangleList.add(triangle3);



        //taking rectangles in the system
        Rectangle rectangle1 = new Rectangle(1,5,3);
        rectangleList.add(rectangle1);

        Rectangle rectangle2 = new Rectangle(1,4,3);
        rectangleList.add(rectangle2);

        Rectangle rectangle3 = new Rectangle(1,6,3);
        rectangleList.add(rectangle3);


        //taking squares in the system
        Square square1 = new Square(1,5);
        squareList.add(square1);

        Square square2 = new Square(2,5);
        squareList.add(square2);

        Square square3 = new Square(3,5);
        squareList.add(square3);






        while (true) {
            System.out.println("----Choose a shape to resize----");
            System.out.println("1. Circle");
            System.out.println("2. Triangle");
            System.out.println("3. Rectangle");
            System.out.println("4. Square");
            System.out.println("5. Quit");
            System.out.print("Enter your choice : ");

            try {
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {

                    case 1:
                        System.out.println("Enter the Circle Id : ");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        boolean foundCircle=false;
                        for (Circle circle : getCircleList()) {
                            if (circle.getCircleId() == id) {
                                circle.resize();
                                foundCircle=true;
                                break;
                            }
                        }

                        if(!foundCircle){
                            System.out.println("Circle Does not Exists");
                        }
                        break;

                    case 2:
                        System.out.println("Enter the Triangle Id : ");
                        int triangleId = scanner.nextInt();
                        scanner.nextLine();

                        boolean foundTriangle = false;
                        for (Triangle triangle : getTriangleList()) {
                            if (triangle.getTriangleId() == triangleId) {
                                triangle.resize();
                                foundTriangle = true;
                                break;
                            }
                        }

                        if (!foundTriangle) {
                            System.out.println("Triangle does not exist");
                        }
                        break;

                    case 3:
                        System.out.println("Enter the Rectangle Id : ");
                        int rectangleId = scanner.nextInt();
                        scanner.nextLine();

                        boolean foundRectangle=false;
                        for (Rectangle rectangle : getRectangleList()) {
                            if (rectangle.getRectangleID() == rectangleId) {
                                rectangle.resize();
                                foundRectangle=true;
                                break;
                            }
                        }

                        if(!foundRectangle) {
                            System.out.println("Rectangle does not exist");
                        }


                        break;
                    case 4:
                        System.out.println("Enter the Square Id : ");
                        int squareId = scanner.nextInt();
                        scanner.nextLine();

                        boolean foundSquare=false;
                        for (Square square : getSquareList()) {
                            if (square.getSquareID() == squareId) {
                                square.resize();
                                foundSquare=true;
                                break;
                            }
                        }

                        if(!foundSquare) {
                            System.out.println("Square does not exist");
                        }
                        break;
                    case 5:
                        System.out.println("Exiting the system...");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }


    }
}

