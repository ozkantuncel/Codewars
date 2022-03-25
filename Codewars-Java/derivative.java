 
package javaapplication51;

import java.util.Arrays;

 
public class JavaApplication51 {

    
    public static void main(String[] args) {
        System.out.println(derivatives("7x^2"));
        
    }
    
    static String derivatives(String str){
        
        if(str.contains("x")&&str.replaceFirst("-", "").length()>2){
            if(str.contains("^")){
                if(str.startsWith("-x")|| str.startsWith("x")){
                    str = str.replace("x", "1x");
                }
                
                String[] div = str.replace("^","").split("x");
                
                int cal = Integer.parseInt(div[0])*Integer.parseInt(div[1]);
                if((Integer.parseInt(div[1])-1)==1){
                    String calEx = cal+"x" ;
                    return calEx;
                }
                
            }
            return str.replace("x", "");
           
        }
          
        return str.contains("x")?str.replace("x","1"):"0";
        
    }
}
