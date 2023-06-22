import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
    public static int QuickAverage(int [] array){
        int ave = 0;
        int sum = 0;
        int num = 0;
        if(array.length == 0)return 0;
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder bigNumber = new StringBuilder();
        for(int i = 0; i < array.length; i++ ){
            sum = sum + array[i];
        }
        ave = sum / array.length;
        for(int i = 0; i < array.length; i++){
            if(array[i] > ave)
            num = array[i];
        }
            //bigNumber = stringBuilder.append((int)array[i]);}
            

       /* }
        for(int i = 0; i < bigNumber.length(); i++ ){
        num = Character.getNumericValue(bigNumber.charAt(i));
        

    }*/ 
    return num;
    }
     
     
    public static void main(String [] args){
        /* int[] array = {2,3,5,7};
        int ave = 0;
        int bigNumber = 0;
        int sum = 0;
        for(int i = 0; i< array.length; i++){   
            sum = sum + array[i];
            //System.out.println(sum);
        
        }
        ave = sum / array.length;
        //System.out.println(ave);
        for(int i = 0; i < array.length; i++){
            if(array[i] > ave){
                System.out.println(array[i]);
            }
        }}}*/


     System.out.println(QuickAverage(new int []{1,1,1,1}));     
    }
} 
        
        
    

    