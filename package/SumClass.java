public class SumClass {
    double sum=0;
    public double sum(double a){
        for(double i=a;i>=0.1;i-=0.1)
        {
            sum+=i;
        }
        return sum;
    }
    
}
