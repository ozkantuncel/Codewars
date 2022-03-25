 
package divisibilityby13;

 
public class Divisibilityby13 {

     
    public static void main(String[] args) {
         System.out.println(dvi13(1234567));
         
    }
    
    public static long dvi13(long n){
        int[] mods = {1,10,9,12,3,4};
        int i=0;
        while(n>99){
            long memory =0;
            for(i =0;n>0;i++){
                memory +=n%10*mods[i%6];
                n/=10;
            }
            n = memory;
        }
        
        return i;
    }
}
