// https://leetcode.com/problems/strobogrammatic-number/

public class IsStrobogrammatic {

	public static void main(String[] args) {
		String num = "88";
		String target = "00 11 88 696";
		for(int i=0,j=num.length()-1;i<j;i++,j--) {
			if(!target.contains(num.charAt(i)+""+num.charAt(j)))
				System.out.println("Not Strobogrammatic");
		}
		System.out.println("Strobogrammatic");

	}

}
