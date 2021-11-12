import java.util.Arrays;


public class Anagrams {

	public static void main(String[] args) {
		
		char[] s1 = "tea".toCharArray();
		char[] s2 = "eat".toCharArray();
		
		Arrays.sort(s1);
		Arrays.sort(s2);
		
		System.out.println(s1);
		System.out.println(s2);

		
		

	}

}
