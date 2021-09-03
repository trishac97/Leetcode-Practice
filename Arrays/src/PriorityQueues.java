import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueues {

	public static void main(String[] args) {
		//Min-Heap
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>((o1,o2)->o1-o2);
		//Max-Heap
		//PriorityQueue<Integer> pq = new PriorityQueue<Integer>((o1,o2)->o2-o1);

		
		pq.add(4);
		pq.add(5);
		pq.add(10);
		pq.add(13);
		pq.add(7);
		pq.add(8);
		pq.add(0);
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());

		}
	}


