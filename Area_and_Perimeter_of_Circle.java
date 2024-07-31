import java.util.Scanner;
public class AreaPerimeter{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        int radius;
        double Area, Perimeter;
        radius = read.nextInt();
        Area = 3.14 * Math.pow(radius, 2);
        Perimeter = 2 * 3.14 * radius;
        System.out.printf("%.2f
",Area);
        System.out.printf("%.2f",Perimeter);
    }
}