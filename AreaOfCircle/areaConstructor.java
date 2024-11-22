public class areaConstructor {
    public areaConstructor(){}
        private double radius;
       public void setRadius(double rad) {
           this.radius = rad;
       }
           public double getRadius(){
               return this.radius;
           }
           public double computeArea(){
           return radius*radius*Math.PI;
           }
        };

