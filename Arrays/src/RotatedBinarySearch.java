
public class RotatedBinarySearch {
	
	public static int binarySearch(int[] a,int left, int right) {
		int x = 9;
		int mid = (left+right)/2;
		
		if(left>right)
			return -1;
		else if(a[mid] == x)
			return 1;
		else if(a[mid]>a[left]) { //left side sorted
			if(x<a[mid] && x>=a[left])
				return binarySearch(a,left,mid-1);
			else return binarySearch(a,mid+1,right);
				
		}
		else if(a[mid]<a[right]) {
			if(x<a[mid] && x>=a[right])
				return binarySearch(a,mid+1,right);
			else
				return binarySearch(a,left,mid-1);
		}
		return -1;
	}

	public static void main(String[] args) {
		int a[]= {10,15,20,0,5};
		
		System.out.println(binarySearch(a,0,a.length));
	}

}
