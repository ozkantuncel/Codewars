 
package bouncingballs;

 
public class BouncingBalls {

     
    public static void main(String[] args) {
        System.out.println(ball(3.0,0.66,1.5));
        System.out.println(ball(30.0,0.66,1.5));
    }
    
    public static int ball(double h,double b,double w){
        if(h<0||(b>1||b<0)||h<w)return -1;
      
        double bounceH = h*b;
        int bounce= 1;
        while(bounceH>w){
            bounce+=2;
            bounceH *=b;
        }
            
        return bounce;
        
    }
}
