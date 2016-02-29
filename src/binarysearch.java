
public class binarysearch {
	public static void main(String[] args) {
		int[] array = {-3,-1,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
		System.out.println(Search(array, -4444));
	}
	
	public static int Search(int[]array, int value){
		int start = 0;
		int end = array.length;
		int mid;
		while(start<=end){
			mid = (start+end)/2;
			
			if(mid>=array.length)return -1;
			if(value == array[mid])return mid;
			else if(value>array[mid])start = mid+1;
			else end = mid-1;
		}
		return -1;
	}
}
