public class RemoveDuplicates {
    public static int removeDuplicates(int [] nums){ // 0,0,1,1,2,2,,5,5
        int insertIndex = 1;
        for(int i = 1; i < nums.length;i++){
            if(nums[i-1] != nums[i]){
            nums[insertIndex] = nums[i];
            insertIndex ++;
        }
    }
        return insertIndex;
    }
    public static void main(String [] args){
        System.out.println(removeDuplicates(new int []{0,1,2,3,4,5}));
    }
    
}
