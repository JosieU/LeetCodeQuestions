public class AtoiStringToInt {
    public static void main(String args[]){
        String num ="2345";
        int i;
        //int j = Integer.parseInt(num);
        //System.out.println(j);
        int number = 0;
        for (i = 0; i < num.length(); i++){
             number = number + Character.getNumericValue(num.charAt(i));
                        
        }
        if(number < 32){
            System.out.println(number);

         }
         else{
            System.err.println("out of range");;

         }
        
        //System.out.println(number);


    }
    
}
