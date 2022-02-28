import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter figure (triangle, rectangular, circle) : ");
        String name = myObj.nextLine();
        if (name == "triangle") {
            Triangle triangle = new Triangle();
            triangle.findSquare(triangle.x, triangle.y, triangle.z);
        }

    }
}
