// Leetcode https://leetcode.com/problems/divide-chocolate/
// Problem on greedy and binary search

public class DivideChocolate {

	public static void main(String[] args) {
		int[] sweetness = {1,2,3,4,5,6,7,8,9};
		int k = 5;
		System.out.println(maximizeSweetness(sweetness,k));

	}
	
	 public static int maximizeSweetness(int[] sweetness, int k) {
	        
	        int low = 1;
	        int high = 0;//can be 10^5, but to optimize the search space max sweetness achieved per person
	        int sum = 0;
	        
	        
	        //Optimization of high
	        for(int i=0;i<sweetness.length;i++){
	            sum+=sweetness[i];
	        }
	        
	        sum/=(k+1);
	        high = sum;
	        
	        while(low<high){
	            int mid = (low+high+1)/2;
	            if(isChunkable(sweetness,k,mid)){
	                low = mid;
	            }
	            else
	                high = mid-1;
	        }
	        
	        return low;
	        
	    }
	    private static boolean isChunkable(int[] sweetness, int k, int mid){
	        int chunkCount = 0;
	        int prefixsum = 0;
	        
	        for(int i=0;i<sweetness.length;i++){
	            prefixsum+=sweetness[i];
	            if(prefixsum>=mid){
	                chunkCount++;
	                prefixsum=0;
	            }
	        }
	        
	        return chunkCount >= k+1;
	    }

}
