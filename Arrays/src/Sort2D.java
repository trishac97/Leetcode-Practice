//Custom Sorting Algorithm

import java.util.Arrays;
import java.util.Comparator;

public class Sort2D {
	
	    public static void sortbyColumn(int arr[][], int col)
	    {
	        Arrays.sort(arr, new Comparator<int[]>() {
	            
	          @Override              
	          public int compare(final int[] entry1, 
	                             final int[] entry2) {

	            if (entry1[col] < entry2[col]) {
	                return 1;

	            }
	            else
	                return -1;
	          }
	        });  
	    }
	      
	    // Driver Code
	    public static void main(String args[])
	    {
	        int matrix[][] = {{5,10},{2,5},{4,7},{3,9}};
	        // Sort this matrix by 3rd Column
	        int col = 2;
	        sortbyColumn(matrix, col - 1);
	  
	        // Display the sorted Matrix
	        for (int i = 0; i < matrix.length; i++) {
	            for (int j = 0; j < matrix[i].length; j++)
	                System.out.print(matrix[i][j] + " ");
	            System.out.println();
	        }
	    }


}
