
public class disarium {

	public static void main(String[] args) {
		System.out.println(dis(89));

	}
	
	static String dis(int a) {
		int result=0;
		int oA=a;
		
		int lenght = String.valueOf(a).length();
		System.out.println(lenght);
		int lenght2 = (int)(Math.log10(a)+1); 
		System.out.println(lenght2);
		
		while(oA>0) {
			
			int res = oA%10;
			oA = oA/10;
			result += Math.pow(res,lenght);
			lenght--;
			System.out.println(result);
		}
		
		return result == a ? "Disarium !!" : "Not !!";
	}
	

}
