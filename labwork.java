import java.util.Scanner;
public class labwork{
    public static void main(String[] args) {
        int i;
        int score=0;
        Scanner scn=new Scanner(System.in);
        System.out.print("What is your name:");
        String name;
        char ans='z';
        name=scn.nextLine();
        System.out.println("Hi "+name+"! Welcome to the Quiz game.\n");
        for(;;){
        for(i=1;i<=5;i++)
        {
            Scanner sc=new Scanner(System.in);
            switch(i){
                case 1:
                System.out.println("What is the capital of Ghana?");
                System.out.println("a]Addis Ababa  b]Gaborone  c]Accra\n");
                ans='c';
                 break;
                case 2:
                System.out.println("What is the independence day of Bangladesh?");
                System.out.println("a]16 Dec  b]26 Mar  c]36 Jul\n");
                ans='c';
                break;
                case 3:
                System.out.println("Which country is known as the Land of the Rising Sun?");
                System.out.println("a]Japan  b]Nepal  c]India\n");
                ans='a';
                break;
                case 4:
                System.out.println(" What is the smallest country in the world?");
                System.out.println("a]Maldives  b]Vatican City  c]Russia\n");
                ans='b';
                break;
                case 5:
                System.out.println("How many continents are there on Earth?");
                System.out.println("a]6  b]7  c]8\n");
                ans='b';
                break;
            }
            char answer=sc.next().charAt(0);;
            if(ans==answer){
                System.out.println("Your answer is correct.\n");
                score+=5;
            }
            else
            {
                System.out.println("Your ans is wrong\n");
                if(score!=0)
                score--;
            }
        }
    
        System.out.println("Your scare is: "+score);
        System.out.println("If you want to play again Enter 1. Else Enter 0");
        int z=scn.nextInt();
        if(z==0)
        break;
        
    }
    }
   
}
