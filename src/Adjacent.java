public class Adjacent {
    public static void main(String [] args){
        int array1[] = {1,1,1,1,1,2,1,1};
        int sum1 = Integer.MIN_VALUE;
        
        for(int i = 0; i < array1.length;i++){
            for(int j = i+1; j<array1.length;j++){
                if(array1[i] + array1[j] > sum1 )
                sum1 = array1[i] + array1[j];
                

            }

        }
        System.out.println(sum1);
    }
    
}
