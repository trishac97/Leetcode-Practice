import java.util.Arrays;
import java.util.Comparator;

//https://leetcode.com/problems/maximum-units-on-a-truck/
public class MaximumUnitsInTruck {
	
	static int maximumUnits(int[][] boxType) {
		
		int truckSize = 13;
		        Arrays.sort(boxType, new Comparator<int[]>() {
		            
		          @Override              
		          public int compare(final int[] entry1, 
		                             final int[] entry2) {

		            if (entry1[2] < entry2[2]) {
		                return 1;

		            }
		            else
		                return -1;
		          }
		        }); 
		        
		        int res = 0;
		        for (int i = 0; i < boxType.length && truckSize > 0; i++) {
		            int min = Math.min(truckSize, boxType[i][0]);
		            truckSize -= min;
		            res += min * boxType[i][1];
		        }
		        return res;
		    }
	

	public static void main(String[] args) {
		int[][] boxType = {{1,3},{2,2},{3,1}};
		System.out.println(maximumUnits(boxType));
	}

}
