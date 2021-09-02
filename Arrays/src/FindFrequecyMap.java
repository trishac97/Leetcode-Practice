import java.util.HashMap;
import java.util.Map;

public class FindFrequecyMap {

	public static void main(String[] args) {
		int[] a = {3,3,2,1,2,1,5};
		
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i:a) {
			map.put(i, map.getOrDefault(i,0)+1);
		}
		
		System.out.println(map);
		

	}

}
