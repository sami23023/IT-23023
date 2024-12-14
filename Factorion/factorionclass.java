public class factorionclass {
    int c,d;
    public int checkfactorion(int i){
            c=i;
            int sum1=1,sum2=0;
            while(c!=0)
            {
                 d=c%10;
                 for(int j=1;j<=d;j++){
                   sum1=sum1*j;
                 }
                   sum2+=sum1;
                   c=c/10;
                   sum1=1;
            }
            if(sum2==i)
            return i;
            else
            return -1;
    }
}

