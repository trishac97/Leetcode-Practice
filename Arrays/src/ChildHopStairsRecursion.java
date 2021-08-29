
public class ChildHopStairsRecursion {
	
	static int countWays(int stairs) {
		if(stairs< 0)
			return 0;
		else if(stairs==1)
			return 1;
		else
		return countWays(stairs-1)+countWays(stairs-2)+countWays(stairs-3);
	}

	public static void main(String[] args) {
		
		int stairs = 5;
		System.out.println(countWays(stairs));
		

	}

}
