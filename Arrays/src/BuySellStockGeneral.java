
public class BuySellStockGeneral {
	
public static void main(String[] args) {
	
	int[] prices = new int[] {3,3,5,0,0,3,1,4};
	
	int k = 1; //Number of transaction permitted
	
	 int length = Math.min(k, prices.length / 2) + 1; 
	 
		int sell[] = new int[length];
		int hold[] = new int[length];
		
		for(int i = 0; i < length; i++)
			hold[i] = Integer.MIN_VALUE;
		
		for(int i = 0; i < prices.length; i++) {
			for(int j = length - 1; j >= 1; j--) { 
				sell[j] = Math.max(sell[j], hold[j] + prices[i]);
				hold[j] = Math.max(hold[j], sell[j - 1] - prices[i]);
			}
		}
		System.out.println(sell[length - 1]);
}
}
