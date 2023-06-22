import java.lang.reflect.Array;
import java.util.*;
public class TagertNumber{
    /*public static int []targetMethod(int number[]){
        int tagert =7;
        int [] numbers ={2,7,5,6};
        for(int i = 0; i<numbers.length;i++){
            for(int j=i+1; j<numbers.length;j++) {       
            if(numbers[i] + numbers[j]== tagert){
             number =new int[]{i,j};
              return number;
                
            }}}
            return 0;
        
    }
    public static void main(String [] rags){
        int []nber = targetMethod(null);

    System.out.println(Arrays.toString(nber));
 

}*/
public static int []targetMethod(int numbers[],int tagert){
    //int [] numbers ={6,3,5};
    if (numbers.length == 0 && numbers.length <= 1) return numbers;
    int [] number = {};
    for(int i = 0; i<numbers.length;i++){
        for(int j=i+1; j<numbers.length;j++) {       
        if(numbers[i] + numbers[j]== tagert){
        number =new int[]{i,j};
        }}


}
return number;
}
public static void main(String []ars){
    //int nber [] ={3,5,6};
    //int nber[]= ;
    //int tagertie = 9;
    System.out.println(Arrays.toString(targetMethod(new int[]{3,2,3}, 6)));
    

}
}
   