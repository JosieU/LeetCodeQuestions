import java.util.Arrays;

public class SortString {

    public static void main(String [] args){
        int [] array = {2,3,2,1,7,5,8};
        String [] names ={"josie","Aly","Alain","Bonte"};
        Arrays.sort(array);
        Arrays.sort(names);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(names));

    }
    
}
