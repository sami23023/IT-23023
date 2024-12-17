import java.util.Scanner;
public class pack {
    public static void main(String[] args){
          Scanner obj = new Scanner(System.in);
          double a=obj.nextDouble();
          int b=obj.nextInt();
          int c=obj.nextInt();
          SumClass sum1=new SumClass();   
          double Sum=sum1.sum(a); 
          printClass pc=new printClass();   
          pc.pr(Sum);
          Divisor obj2=new Divisor();
         int gcd=obj2.GCD(b,c);
         int lcm=obj2.LCM(b,c);
         pc.pr2(gcd);
         pc.pr2(lcm);
}
}
