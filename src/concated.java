public class concated {
    static int checkConcatenatedSum(int n, int catlen){
        int originalNumber = n;
        int totalSum = 0;
        while(n!=0){
            int digit = n%10;
            int concatSum = 0;
            for(int i=0;i<catlen;i++){
                concatSum = (concatSum *10) + digit;//198, 8
            }
            totalSum =totalSum + concatSum;
            n = n/10;
        }
        return  originalNumber == totalSum ? 1 : 0;
}}