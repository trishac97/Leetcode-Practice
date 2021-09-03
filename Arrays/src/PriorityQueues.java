import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueues {

	public static void main(String[] args) {
		//Min-Heap
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>((o1,o2)->o1-o2); // Default sorting of Priority queue is ascending.
		//Max-Heap
		//PriorityQueue<Integer> pq = new PriorityQueue<Integer>((o1,o2)->o2-o1);		
		pq.add(4);
		pq.add(5);
		pq.add(10);
		pq.add(13);
		pq.add(7);
		pq.add(8);
		pq.add(0);
	//User offer() and add() interchangeably. offer() doesn't throws an exception when insertion restriction.	
		
		System.out.println(pq.poll());
		System.out.println(pq.poll()); //poll() removes the root node.
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());

		}
	}


