import java.util.Scanner;


public class Circle {
    double radius;
    double s;
    public void choose_radius() {
        Scanner circle_Obj = new Scanner(System.in);
        System.out.println("Enter circle radius : ");
        radius = circle_Obj.nextInt();
    }
    public void findSquare(double radius) {
        s = (Math.PI * (radius * radius));
        System.out.println("Circle square is " + s);
    }
}
