 
package rectangle;

import java.math.BigInteger;

 
public class Rectangle {

     
    public static void main(String[] args) {
        System.err.println(sumFct(BigInteger.valueOf(50000)));
	
    }
    
    public static BigInteger sumFct(BigInteger n){
        
        int n1 = n.intValue();
        BigInteger sum =BigInteger.valueOf(0),a=BigInteger.valueOf(1),b=BigInteger.valueOf(2);
        
	for(int i=0;i<n1;i++) {
		//System.out.println(a);
		sum = a.add(b);
		a =b;
		b = sum;
	}
        sum = sum.subtract(BigInteger.valueOf(1));
        return sum.multiply(BigInteger.valueOf(4));
    }
    
}
