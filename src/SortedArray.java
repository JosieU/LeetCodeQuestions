import java.util.Arrays;

public class SortedArray {
    public static void main(String args[]){
        int []array1 ={1,2,3};
        int []array2 ={5,6,8,10,12};
        int []array = new int[array1.length + array2.length];
        int medianIndex = array.length /2;
        
        int i;
        for(i = 0; i< array1.length;i++){
            array[i] = array1[i];
             //6 7 8 9     
            /*if(array.length % 2 != 0){
                int medianItem = array.length / 2;
                int medianIndex = array[medianItem];
                System.out.println(medianIndex);*/
            }
            for(i =0; i<array2.length;i++){
                array[array1.length + i] = array2[i];

            }
            if(array.length % 2 !=0){
                
                int medianItem = array[medianIndex];                
                System.out.println(medianItem);
            }
            else if (array.length % 2 == 0){
                Double medianItem = (double) ((array[medianIndex-1] + array[medianIndex]) /2);
                System.out.println(medianItem);
                

                
                
            }
                
            }}
        
       


   
