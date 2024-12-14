import java.util.Scanner;
public class Factorion {
    public static void main(String[] args){
          Scanner obj=new Scanner(System.in);
          System.out.println("Enter the range: ");
          int a,b,e;
          a=obj.nextInt();
          b=obj.nextInt();
          System.out.println("The factorian numbers are: ");
          factorionclass fc=new factorionclass();
          for(int i=a;i<=b;i++){
          e=fc.checkfactorion(i);
          if(e!=-1)
          System.out.println(e);
          }
          obj.close();
    }
}
