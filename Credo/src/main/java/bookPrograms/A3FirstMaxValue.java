package bookPrograms;

public class A3FirstMaxValue {
	public static void main(String[] args) {
		int arr[] = {1,34,56,2,4,6};
		
		for(int i = 0 ; i <arr.length; i ++) {
			
			for(int j = i+1; j <arr.length; j ++) {
				
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println(arr[i]);
			
			}
		int sum = 0 ; 
		for(int i1 = 0 ; i1<arr.length; i1++) {
			sum = sum + arr[i1];
			
		}
		System.out.println("sum of array: "+ sum);
		
	}

}
