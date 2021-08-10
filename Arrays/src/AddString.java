
//https://leetcode.com/problems/add-strings/

public class AddString {
	
	public static void function(String num1, String num2) {
		StringBuilder result = new StringBuilder();
		
		int i = num1.length()-1;
		int j = num2.length()-1;
		int carry = 0;
		
		while(i>=0 || j>=0) {
			int sum = carry;
			if(i>=0) {
				sum += num1.charAt(i--)-'0';
			}
			if(j>=0) {
				sum +=num2.charAt(j--)-'0';
			}
			result.append(sum%10);
			carry = sum/10;
		}
		if(carry!=0)
			result.append(carry);
		System.out.println(result.reverse());
		
	}

	public static void main(String[] args) {
		// 123 + 1 = 124
		String num1 = "123";
		String num2 = "1";
		function(num1,num2);
	}

}
