//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Shape shape = new Shape();
        System.out.println(shape);
        System.out.println("**********************************************");

        Shape shape1 = new Shape("red",true);
        System.out.println(shape1);
        System.out.println("**********************************************");

        Circle circle1 = new Circle(32);

        System.out.println(circle1.toString());
        System.out.println("**********************************************");

        Circle circle2 = new Circle("yellow",true,24);

        System.out.println(circle2);
        System.out.println("**********************************************");
        circle2.setRadius(5);
        circle2.setColor("black");
        System.out.println(circle2);
        System.out.println("**********************************************");


        Rectangle rect1 = new Rectangle( 32, 32);
        System.out.println(rect1);
        System.out.println("**********************************************");

        rect1.setWidth(2);

        System.out.println(rect1.toString());
        System.out.println("**********************************************");
        Square square1 = new Square(20);

        System.out.println(square1.toString());
        System.out.println("**********************************************");

        square1.setSide(30);
        square1.setColor("blue");
        System.out.println("square1 side is " + square1.getSide());
        System.out.println("**********************************************");

        System.out.println(square1);
        System.out.println("**********************************************");










    }


}