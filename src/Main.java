//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Circle c1 = new Circle(1, 2, 2);
        System.out.println("Area of Circle " + c1.getArea());
        System.out.println("Cordinatw are " + c1.getCoordinate());

        c1.moveDown();
        System.out.println("After move Down, Coordinate are " + c1.getCoordinate());

        c1.moveRight();
        System.out.println("After move right, Coordinate are " + c1.getCoordinate());

        c1.moveUp();
        System.out.println("After move up, Coordniate are " + c1.getCoordinate());

        c1.moveLeft();
        System.out.println("After move left, Coordinate are " + c1.getCoordinate());

        System.out.println("------------Test Polymorphism------------");
        Movable c2 = new Circle(5, 10, 30);
        c2.moveUp();
        System.out.println("After move up, coordniate are " + c2.getCoordinate());

        c2.moveLeft();
        System.out.println("After move left, coordinate are " + c2.getCoordinate());



        Rectangle test1 = new Rectangle("Julio", 29);
        System.out.println("My name is " + test1.name + " I am " + test1.age);




    }
}