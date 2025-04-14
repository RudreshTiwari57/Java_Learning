package java_collections;
import java.util.PriorityQueue;

//-----------------------------------🔸 What is PriorityQueue in Java?
//PriorityQueue is a part of java.util package and implements the Queue interface, designed to process elements according to
//priority rather than FIFO (First In, First Out).
//
//        🔹 Key Points:
//                It’s not thread-safe (for concurrency use PriorityBlockingQueue).
//                It is backed by a binary heap (min-heap by default).
//                Null elements are not allowed.
//                Implements Comparable or can be customized with a Comparator.


//------------------------------ Declaration Examples:
//                PriorityQueue<Integer> pq = new PriorityQueue<>(); // Natural ordering (min-heap)
//                PriorityQueue<Integer> maxPq = new PriorityQueue<>(Collections.reverseOrder()); // Max-heap
//                PriorityQueue<String> pqString = new PriorityQueue<>((a, b) -> b.length() - a.length()); // Custom comparator


//--------------------------------- ⚙️ Internal Working:
//        ✅ Backed by a Min-Heap:
//            The lowest element is always at the head.
//            Internally uses an array (Object[] queue) to represent the heap.
//            Heap is maintained using sift-up and sift-down algorithms during insertions and deletions.
//
//        ✅ Key Internal Methods:
//            add() / offer() – Inserts an element.
//            poll() – Retrieves and removes the head.
//            peek() – Retrieves (but does not remove) the head.
//            remove() – Removes a specific element.

//        ✅ Time Complexity:
//            Operation	    Time Complexity
//            add/offer	        O(log n)
//            remove/poll	    O(log n)
//            peek	            O(1)

//---------------------------------- 🔄 Custom Objects in PriorityQueue
//                      To insert custom objects, you must implement Comparable or provide a Comparator.

class Task implements Comparable<Task> {
    int priority;
    String name;

    public Task(int priority, String name) {
        this.priority = priority;
        this.name = name;
    }

    public int compareTo(Task other) {
        return Integer.compare(this.priority, other.priority); // Min heap
    }
}



public class priorityqueue_java {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(10);
        pq.add(5);
        pq.add(20);

        System.out.println(pq.poll()); // 5 (smallest)
        System.out.println(pq.peek()); // 10 (next smallest)


        PriorityQueue<Task> taskQueue = new PriorityQueue<>();
        taskQueue.add(new Task(1, "Low"));
        taskQueue.add(new Task(0, "High"));

    }
}
