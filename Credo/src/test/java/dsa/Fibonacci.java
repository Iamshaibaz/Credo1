package dsa;

import java.util.Arrays;


public class Fibonacci {
	  public static void main(String[] args) {
	    Fibonacci mn = new Fibonacci();
	    int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
	   
	    mn.rotateMatrix(matrix);
	    System.out.println(Arrays.deepToString(matrix));


	  }

	  public boolean rotateMatrix(int[][] matrix) {
	    if (matrix.length == 0 || matrix.length != matrix[0].length) return false;
	    int n = matrix.length;
	    for (int layer = 0; layer < 1; layer++) {
	    	 System.out.println("for loop outside : "+layer);
	      int first = layer;
	      int last = n - 1 - layer;
	      for (int i=first; i<last; i++) {
	    	 System.out.println("first: "+first);
	    	 System.out.println("last:  "+last);
	    	 
	        int offset = i - first;
	        System.out.println("offset "+offset);
	       
	        int top = matrix[first][i];
	        System.out.println("top :"+top);
	        matrix[first][i] = matrix[last-offset][first];
	        System.out.println("matrix[first][i]:"+matrix[first][i] );
 	        matrix[last-offset][first] = matrix[last][last-offset];
	        System.out.println("matrix[last-offset][first] "+matrix[last-offset][first] );
	        matrix[last][last-offset] = matrix[i][last];
	        System.out.println("matrix[last][last-offset]"+ matrix[last][last-offset]);
	        matrix[i][last] = top;
	      
	        System.out.println(" matrix[i][last] "+ matrix[i][last] );
	      }

	    }
	    return true;

	  }


	}
