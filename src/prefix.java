import java.util.Arrays;

public class prefix {
    public static String longestPregic(String [] strs){
        
        Arrays.sort(strs);
        StringBuilder result = new StringBuilder();
        // String empty ="";
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length -1].toCharArray();
        for(int i = 0; i < first.length; i++){
            if(first[i] != last[i])
            break;
                result.append(first[i]);
            }
            return result.toString();
        }
     
        public static void main(String[] args) {
            System.out.println(longestPregic( new String[]{"flower","flow","flight"}));
            

        }
             

        


    }
    

