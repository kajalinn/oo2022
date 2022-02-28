import java.util.Scanner;

public class Triangle {
    int halfPerimeter;
    int s;
    double square;
    Scanner triangle_Obj = new Scanner(System.in);
    System.out.println("Enter figure triangle sides(x, y, z) : ");
    int x = triangle_Obj.nextInt();
    int y = triangle_Obj.nextInt();
    int z = triangle_Obj.nextInt();
    public void findSquare(int x, int y, int z){
        halfPerimeter = (x + y + z) / 2;
        s = halfPerimeter * (halfPerimeter - x) * (halfPerimeter - y) * (halfPerimeter - z);
        square = Math.sqrt(s);
        System.out.println("Triangle square is " + square);
    }
}
