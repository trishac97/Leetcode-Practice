
// https://leetcode.com/problems/k-closest-points-to-origin/

import java.util.Comparator;
import java.util.PriorityQueue;

public class KClosestPoint {
	
	
	
	
	public static int[][] findDistance(int[][] points) {
		int K = 1;
		        
		        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
		            public int compare(int[] a, int[] b) {
		                return (b[0]*b[0] + b[1]*b[1]) - (a[0]*a[0] + a[1]*a[1]);
		            }
		        });
		        
		        for(int[] point: points) {
		            pq.add(point);
		            if(pq.size() > K) pq.poll();
		        }
		        return pq.toArray(new int[0][0]);
		    }
		

	public static void main(String[] args) {
		int[][] points = {{5,2},{3,-2},};
		int[][] p1 = findDistance(points);
		System.out.println(p1[0][0]);
		System.out.println(p1[0][1]);


	}

}
