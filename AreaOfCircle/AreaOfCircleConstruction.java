import java.util.Scanner;

public class AreaOfCircleConstruction {
    public static void main(String[] args){
        double radius;
        double Area;
        Scanner sc= new Scanner(System.in);
        radius=sc.nextDouble();
        areaConstructor obj= new areaConstructor();
        obj.setRadius(radius);
        System.out.println("The area of the circle of radius "+obj.getRadius()+" is :"+obj.computeArea());
    }
}
