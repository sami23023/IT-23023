public class Divisor {
    public int GCD(int b,int c){
        if(c==0){
            return b;
        }
        return  GCD(c, b%c);
    }
    public int LCM(int b,int c){
        return Math.abs(b*c)/GCD(b,c);
    }
}
