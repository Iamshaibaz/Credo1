package zzzzzzzzz;


import java.util.Arrays;


public class SortingArray {
  public static void main (String [] args) {
   int [] array = {45,12,85,32,89,39,69,44,42,1,6,8};
   Arrays.sort(array);
   int count=0;
   for (int i = 0; i < array.length; i++) {
	
   System.out.print(array[i]+" ");
   count++;
   }
   
   System.out.println();
   System.out.println("count is "+count);
   System.out.println(array[count-2]);
  }
  
  
  
}