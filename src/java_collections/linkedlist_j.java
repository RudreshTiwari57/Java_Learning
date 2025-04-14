package java_collections;

//Java’s LinkedList class is part of java.util and is a doubly linked list implementation of the List, Deque, and Queue interfaces.

// ⚙️ Class Declaration:
//            public class LinkedList<E>
//                    extends AbstractSequentialList<E>
//                    implements List<E>, Deque<E>, Cloneable, Serializable


//  ✅ Key Features
//            Allows duplicate elements
//            Maintains insertion order
//            Not synchronized (use Collections.synchronizedList for thread-safety)
//            Can be used as List, Queue, or Deque (Double-ended Queue)
//            Faster insert/delete at beginning/middle (compared to ArrayList)

//  ⚡ Performance Comparison
//            Operation	        ArrayList	    LinkedList
//            get(index)	        O(1)	        O(n)
//            add/remove end	    O(1)	        O(1)
//            add/remove start	    O(n)	        O(1)
//            add/remove mid	    O(n)	        O(n)

//        So, use LinkedList when:
//            You frequently insert/remove at the beginning/middle
//            You don’t need fast random access


//🧠 Internal Working of LinkedList
//        Each node in Java’s LinkedList has:

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

//                transient int size = 0;
//                transient Node<E> first;
//                transient Node<E> last;
//
//                private static class Node<E> {
//                    E item;
//                    Node<E> next;
//                    Node<E> prev;
//                }
//          Yes, it’s doubly linked under the hood. next and prev pointers allow traversal in both directions.
public class linkedlist_j {

    public static void main(String[] args) {
//        🔧 Common Operations:
                LinkedList<String> list = new LinkedList<>();

                // Adding elements
                        list.add("Apple");
                        list.add("Banana");
                        list.addFirst("Mango");   // Add to beginning
                        list.addLast("Grapes");   // Add to end

                // Accessing elements
                        String first = list.getFirst();
                        String last = list.getLast();
                        String second = list.get(1);

                // Removing elements
                        list.removeFirst();
                        list.removeLast();
                        list.remove("Banana");

                // Iterating
                        for (String fruit : list) {
                            System.out.println(fruit);
                        }

                // Size
                        int size = list.size();

                // Check if empty
                        boolean empty = list.isEmpty();



//         💡 Usage Examples
//                ✅ As Queue
                        Queue<String> queue = new LinkedList<>();
                        queue.offer("A");
                        queue.offer("B");
                        queue.poll();   // Removes "A"


//                ✅ As Stack
                        Deque<Integer> stack = new LinkedList<>();
                        stack.push(1);
                        stack.push(2);
                        stack.pop();    // Removes 2



    }

}
