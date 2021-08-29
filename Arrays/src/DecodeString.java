import java.util.Stack;

public class DecodeString {
	
	
	    public static String decodeString(String s) {
	        Stack<String> prefixes = new Stack<>();
	        Stack<Integer> numbers = new Stack<>();
	        StringBuilder sb = new StringBuilder();
	        
	        for (int i = 0; i < s.length(); i++) {
	            char c = s.charAt(i);
	            if (Character.isDigit(c)) {
	                int number = 0;
	                while (Character.isDigit(s.charAt(i))) {
	                    number = number*10 + (s.charAt(i) - '0');
	                    i++;
	                }
	                numbers.push(number);
	                prefixes.push(sb.toString());

	                System.out.println("Number Stack: "+numbers);
	                System.out.println("Prefix Stack: "+prefixes);

	                sb.setLength(0);
	            } else if (c == ']') {
	                String inner = sb.toString();
	                sb.setLength(0);
	                sb.append(prefixes.pop());
	                int number = numbers.pop();
	                for (int j = 0; j < number; j++) {
	                    sb.append(inner);
	                }
System.out.println("Inner process: "+sb);
	            } else {// a regular character
	                sb.append(c);
	                System.out.println("Character Found: "+c);
	                
	            }
	            System.out.println("===Round===");
	        }
	        return sb.toString();
	    }
	
	
	

	public static void main(String[] args) {
		System.out.println(decodeString("3[a2[c]]"));
	}

}
