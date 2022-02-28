import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Rectangular rectangular = new Rectangular();
        Circle circle = new Circle();
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter figure (triangle, rectangular, circle) : ");
        String name = myObj.nextLine();
        if (Objects.equals(name, "triangle")) {
            triangle.choose_sides();
            triangle.findSquare(triangle.x, triangle.y, triangle.z);
        }
        if (Objects.equals(name, "rectangular")) {
            rectangular.choose_sides();
            rectangular.findSquare(rectangular.a, rectangular.b);
        }
        if (Objects.equals(name, "circle")) {
            circle.choose_radius();
            circle.findSquare(circle.radius);
        }

    }
}
