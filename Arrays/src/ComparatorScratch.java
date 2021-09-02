import java.util.Arrays;

public class ComparatorScratch {
	
	static String[] reorderLogFiles(String[] logs) {
		Arrays.sort(logs,(log1,log2)->{
            int index1 = log1.indexOf(" ");
            String id1 = log1.substring(0,index1);
            String s1 = log1.substring(index1+1);
            
            int index2 = log2.indexOf(" ");
            String id2 = log2.substring(0,index2);
            String s2 = log2.substring(index2+1);
            
            boolean isDigit1 = Character.isDigit(s1.charAt(0));
            boolean isDigit2 = Character.isDigit(s2.charAt(0));
 //two letter
            if(!isDigit1 && !isDigit2){
                int comp = s1.compareTo(s2);
                if(comp == 0)
                    return id1.compareTo(id2);
                return comp;
            }
            else 
                return isDigit1?(isDigit2?0:1):-1;
            
        });
        
        return logs;
	}

	public static void main(String[] args) {
		String[] logs = {"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"};
		
		reorderLogFiles(logs);
	}

}
