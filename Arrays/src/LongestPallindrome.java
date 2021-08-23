import java.util.Stack;

public class LongestPallindrome {

	public static void function(String[] strs) {
		Stack<Character> stack = new Stack<Character>();
		int k =0;
		for(int i=0;i<strs[0].length();i++) {
			stack.push(strs[k].charAt(i));
		}
	}
	public static void main(String[] args) {
		// ["flower","flow","flight"] -> fl
		String[] strs = {"flower","flow","flight"};
		function(strs);
	}


}
