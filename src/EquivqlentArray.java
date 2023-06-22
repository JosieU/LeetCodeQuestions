public class EquivqlentArray {
    public static int equivalentArray(int []a, int []b){
        if(a.length == 0 && b.length == 0) {
			return 1;
		}
		else if(a.length == 0 || b.length == 0) {
			return 0;
		}
		else {
			
			for(int i = 0;i<a.length;i++) {
				int count = 0;
				for(int j=0;j<b.length;j++) {
					if(a[i] == b[j]) {
						count++;
					}
				}
				if(count == 0) {
					return 0;
				}
			}
		   for(int i = 0;i<b.length;i++) {
				int count = 0;
				for(int j=0;j<a.length;j++) {
					if(b[i] == a[j]) {
						count++;
					}
				}
				if(count == 0) {
					return 0;
				}
			}
			
			
		}
		return 1;
	}
    public static void main(String [] args){
        System.out.println(equivalentArray(new int[]{2,4,3,5}, new int []{5,4,3,2,1,0}));
        System.out.println(equivalentArray(new int[]{2,4,3,5}, new int []{5,4,3,2}));
        System.out.println(equivalentArray(new int[]{2,4,3,5}, new int []{5,4,3,2,2,5}));
        //System.out.println(equivalentArray(new int[]{2,4,3,5}, new int []{5,4,3,2,1,0}));
    }
    
}
