 
package reducing.by.steps;

 
public class ReducingBySteps {

     
    public static void main(String[] args) {
        System.out.println( middle("midal"));
        System.out.println( "middl".length()/2);
    }
    
    public static String middle(String str){
        
        
        
        return str.length()%2==0? str.substring((str.length()/2)-1,((str.length()/2)+1)):str.substring(str.length()/2,str.length()/2+1);
    }
    
}
