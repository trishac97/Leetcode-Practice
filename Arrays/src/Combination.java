import java.util.LinkedList;
import java.util.Queue;

public class Combination {

	public static void main(String[] args) {
		String str = "abcde";

		backtrack(0,new StringBuilder(),str);

	}
	
	public static void backtrack(int first, StringBuilder curr, String str) {
		//Queue<String> queue = new LinkedList<>();
		int k = 3;
		if(curr.length() == 3) {
			System.out.println(curr);
			//queue.add(new String(curr));
			return;

		}
		
		for(int i=first;i<str.length();i++) {
			
			curr.append(str.charAt(i));
			backtrack(i+1,curr,str);
			System.out.println("boom:"+i);
			curr.deleteCharAt(curr.length() - 1);
		}
	}

}
