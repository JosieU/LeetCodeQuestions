import java.util.Arrays;

public class divident {
    
    public static void main (String[] args){
       int tagert = 9;
       
       int [] numbers = {2,7,6,5,3};
       for(int i = 0; i<numbers.length;i++){
        for(int j=i+1; j<numbers.length;j++) {       
        if(numbers[i] + numbers[j]== tagert){
            int [] number ={i,j};

            System.out.println("the the index "+Arrays.toString(number));

        }
       }

    }
    }}
