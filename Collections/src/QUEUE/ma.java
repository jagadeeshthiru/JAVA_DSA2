package QUEUE;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class ma {
  public static void main(String[] args) {
	Queue queue =new PriorityQueue(Arrays.asList(10,3,10,45,65,31));
	queue.offer(2);
	queue.poll();
	queue.poll();queue.poll();queue.poll();queue.poll();queue.poll();queue.poll();
	System.out.println(	queue.peek());
	System.out.println(queue);
	
}
}
