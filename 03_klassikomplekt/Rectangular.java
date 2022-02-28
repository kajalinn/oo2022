import java.util.Scanner;

public class Rectangular {
    int s;
    int a, b;

    public void choose_sides(){
        Scanner rectangular_Obj = new Scanner(System.in);
        System.out.println("Enter rectangular sides(a, b): ");
        a = rectangular_Obj.nextInt();
        b = rectangular_Obj.nextInt();
    }
    public void findSquare(int a, int b){
        s = a*b;
        System.out.println("Rectangular square is " + s);
    }
}
