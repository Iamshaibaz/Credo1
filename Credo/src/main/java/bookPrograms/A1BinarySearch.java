package bookPrograms;

public class A1BinarySearch {
	
	public static void main(String[] args) {
		int[] arr = {2,4,5,33,2,1};
		for(int i = 0 ; i < arr.length; i ++) {
			for(int y = i +1 ; y<arr.length; y++) {
				if(arr[i]>arr[y]) {
					int temp = arr[i];
					arr[i] = arr[y];
					arr[y] = temp;
				}
				
			}System.out.print(arr[i]+ " ");
		}
	}

}
