import java.util.Arrays;

import javax.print.DocFlavor.STRING;

public class PlusOne {
    public static String PlusOneMethod(int []digits){
        //public static void main(String [] args){
        //int [] digits = {99};  
            int []zeroValues = new int[digits.length + 1];     
            int result = digits[digits.length -1] + 1;
            digits[digits.length -1] = result;
            if(String.valueOf(result).toLowerCase().contains("0")){
                String s = Integer.toString(result);
                for(int i = 0; i< s.length()-1;i++){
                    zeroValues[i] = Character.getNumericValue(s.charAt(i));
                    //return Arrays.toString(zeroValues);
                    
                
        
            
        }
        
        return Arrays.toString(zeroValues);
        
    }
    return Arrays.toString(digits);

        }
    public static void main(String []args) {

        System.out.println(PlusOneMethod(new int[]{1,2,3}));
    }}