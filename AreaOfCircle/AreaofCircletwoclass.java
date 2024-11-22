import java.util.Scanner;
public class AreaofCircletwoclass {
    public static void main(String[] args)
    {
        double radius;
        double Area;
        Scanner sc= new Scanner(System.in);
        radius=sc.nextDouble();
      area obj= new area();
      Area=obj.computearea(radius);
        System.out.println("The area of the circle of radius "+radius+" is :"+Area);
    }
}
