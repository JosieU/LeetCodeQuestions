public class reverseNumber {
    public static void main(String []args){
        int number =1235;
        int reverseNumber= 0;
        for(int i = 0; i<= number; i++){
        reverseNumber = (reverseNumber * 10 )+ (number % 10);// 0+5,50+3,530+2,5320+1
        number = number/10;//123,12,1,0
        //5321
        }
        System.out.println(reverseNumber);


    }
    
}
