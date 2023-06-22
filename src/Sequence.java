public class Sequence {
/*public static void main(String []args)
{
int []array ={1,4,2,3,4,5};
int number = 0;
for(int i = 0; i< array.length;i++){
    for (int j = i+1; j< array.length;j++){
        if(array[i]<= array[j]){
        if((array[j]-array[i]== 0 || array[j] - array[i]== 1)){
           number = 1;

        }
        else{
            number = 0;
        }
        
    }
    System.out.println(number);
}
}    
}*/
public static int isSequnceArray(int []a, int m, int n){
    
    if(a[0] != m || a[a.length -1] != n) return 0;
  for(int i = 0; i< a.length-1;i++){
    if( (a[i+1] - a[i] != 0 && a[i+1] - a[i] !=1))
        return 0;
    
  }
  
  return 1;
  

}
public static void main(String [] args){

    System.out.println(isSequnceArray(new int[]{1,2,3,4,5},1,5));
    System.out.println(isSequnceArray(new int[]{-5,-5,-5,-4,-4,-3,-2,-2},-5,-2));
    System.out.println(isSequnceArray(new int[]{1,2,4,3,5},1,5));
}
}