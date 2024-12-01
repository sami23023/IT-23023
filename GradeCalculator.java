import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int ct,at,fe;
      double total=0,credit=0,cgpa=0,CGPA=0,CREDIT=0,Credit=0;
      System.out.print("Please enter your ID: "); 
      String id=sc.nextLine();
      for(int i=1;i<=3;i++)
      {
           switch(i){
            case 1: 
            System.out.println("C1:");
            System.out.print("Credit: ");
            credit=sc.nextDouble();
            System.out.print("CT: ");
            ct=sc.nextInt();
            System.out.print("AT: ");
            at=sc.nextInt();
            System.out.print("FE: ");
            fe=sc.nextInt();
            total=ct+at+fe;
            break;
           
           case 2: 
            System.out.println("C2:");
            System.out.print("Credit: ");
            credit=sc.nextDouble();
            System.out.print("CT: ");
            ct=sc.nextInt();
            System.out.print("AT: ");
            at=sc.nextInt();
            System.out.print("FE: ");
            fe=sc.nextInt();
            total=ct+at+fe;
            break;

            case 3: 
            System.out.println("C3:");
            System.out.print("Credit: ");
            credit=sc.nextDouble();
            System.out.print("CT: ");
            ct=sc.nextInt();
            System.out.print("AT: ");
            at=sc.nextInt();
            System.out.print("FE: ");
            fe=sc.nextInt();
            total=ct+at+fe;
            break;
           }
           Credit=Credit+credit;
          if(total>=80)
          cgpa=4.00;
          else if(total>=75&&total<80)
          cgpa=3.75;
          else if(total>=70&&total<75)
          cgpa=3.50; 
          else if(total>=65&&total<70)
          cgpa=3.25;
          else if(total>=60&&total<65)
          cgpa=3.00;
          else if(total>=55&&total<60)
          cgpa=2.75;
          else if(total>=50&&total<55)
          cgpa=2.50;
          else if(total>=45&&total<50)
          cgpa=2.25;
          else if(total>=40&&total<45)
          cgpa=2.00;
          else 
          credit=0;
          CREDIT=CREDIT+credit;
          CGPA=CGPA+cgpa*credit;

        }
        CGPA=CGPA/CREDIT;
        System.out.println("STUDENT ID: "+id);
        System.out.println("CREDIT TAKEN: "+Credit);
        System.out.println("CREDIT EARNED: "+CREDIT);
        System.out.println("CGPA: "+CGPA);
        System.out.print("GRADE: ");
        if(CREDIT>=4.00)
        System.out.print("A+");
        else if(CREDIT>=3.75&&CREDIT<4.00)
        System.out.print("A");
        else if(CREDIT>=3.50&&CREDIT<3.75)
        System.out.print("A-");
        else if(CREDIT>=3.25&&CREDIT<3.50)
        System.out.print("B+");
        else if(CREDIT>=3.00&&CREDIT<3.25)
        System.out.print("B");
        else if(CREDIT>=2.75&&CREDIT<3.00)
        System.out.print("B-");
        else if(CREDIT>=2.50&&CREDIT<2.75)
        System.out.print("C+");
        else if(CREDIT>=2.25&&CREDIT<2.50)
        System.out.print("C");
        else if(CREDIT>=2.00&&CREDIT<2.25)
        System.out.print("D");
        else 
        System.out.print("FAIL");           
    }
}
