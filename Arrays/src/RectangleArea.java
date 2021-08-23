
// https://leetcode.com/problems/rectangle-area/

public class RectangleArea {
	
	  public static int findArea(int x, int y){
	        return Math.abs(x*y);
	    }
	    public static int updateArea(int x1, int y1, int x2, int y2){
	        return findArea(Math.abs(x2-x1),Math.abs(y2-y1));
	        
	    }
	    public static int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
	        
	        int area = 0;
	        
	        int area1 = findArea(Math.abs(ax2-ax1),Math.abs(ay2-ay1));
	        int area2 = findArea(Math.abs(bx2-bx1),Math.abs(by2-by1));
	        
	        area = area1+area2;
	        int common = (ax2 <= bx1 || ax1 >= bx2 || ay1 >= by2 || ay2 <= by1) ? 0: updateArea(Math.max(ax1,bx1),Math.max(ay1,by1),Math.min(ax2,bx2),Math.min(ay2,by2));
	        
	        area = area-common;
	        
	        return area;
	        
	        
	    }

	public static void main(String[] args) {
		System.out.println(computeArea(-3,
				0,
				3,
				4,
				0,
				-1,
				9,
				2));

	}
	
	
	
	  
	

}
