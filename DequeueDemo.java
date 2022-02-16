package Week5.Session21;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueDemo {
    public static void main(String[] args) {
        Deque<Integer> q1 = new ArrayDeque<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        q1.add(5);

        ArrayDeque<Integer> q2 = new ArrayDeque<>();
        q2.add(10);
        q2.add(9);
        q2.add(8);
        q2.add(7);
        q2.add(6);

        System.out.println("Queue 1 : ");
        for(Integer i : q1) {
            System.out.println(i);
        }

        System.out.println("Queue 2 : ");
        for(Integer i : q2) {
            System.out.println(i);
        }

        q1.addAll(q2);
        System.out.println("After q1.addAll(q2) : ");
        for(Integer i : q1) {
            System.out.println(i);
        }

        System.out.println("Size of Queue is :: "+q1.size());
        System.out.println("Does q1 contains 5 :: "+q1.contains(5));

        System.out.println("First Element in queue is :: "+q1.getFirst());
        System.out.println("Last Element in queue is :: "+q1.getLast());
        q1.addFirst(1);  // add at front
        q1.addLast(11);   // add at last
        System.out.println(q1);

        System.out.println("Head is :: q1.getElement() :: "+q1.element());
        System.out.println("Head is :: q1.peek() :: "+q1.peek());
        System.out.println("First Element in queue :: "+q1.peekFirst());
        System.out.println("Last Element in queue :: "+q1.peekLast());

        System.out.println("Removed Head :: "+q1.poll());
        System.out.println("Removed First Element :: "+q1.pollFirst());
        System.out.println("Removed Last Element :: "+q1.pollLast());
        System.out.println(q1);

        q1.offer(21);
        q1.offerFirst(1);
        q1.offerLast(22);
        System.out.println("After offer() operations :: "+q1);

        System.out.println("Removed First Element :: "+q1.pop());
        q1.push(1); // Adding at index 0 ;
        System.out.println(q1);

        q1.removeFirst();
        q1.removeLast();
        System.out.println("After removeFirst() and removeLast() :: "+q1);

        q1.removeFirstOccurrence(2);
        q1.removeLastOccurrence(22);
        System.out.println(q1);



    }
}

/* CONCLUSIONS :
   1) Null value      ==> NOT ALLOWED
   2)Duplicate values ==> ALLOWED
   3) Order           ==> INSERTION ORDER

* */

/* OUTPUT

Queue 1 :
1
2
3
4
5
5

Queue 2 :
10
9
8
7
6

After q1.addAll(q2) :
1
2
3
4
5
5
10
9
8
7
6

Size of Queue is :: 11
Does q1 contains 5 :: true

First Element in queue is :: 1
Last Element in queue is :: 6
[1, 1, 2, 3, 4, 5, 5, 10, 9, 8, 7, 6, 11]

Head is :: q1.getElement() :: 1
Head is :: q1.peek() :: 1
First Element in queue :: 1
Last Element in queue :: 11

Removed Head :: 1
Removed First Element :: 1
Removed Last Element :: 11
[2, 3, 4, 5, 5, 10, 9, 8, 7, 6]

After offer() operations :: [1, 2, 3, 4, 5, 5, 10, 9, 8, 7, 6, 21, 22]

Removed First Element :: 1
[1, 2, 3, 4, 5, 5, 10, 9, 8, 7, 6, 21, 22]

After removeFirst() and removeLast() :: [2, 3, 4, 5, 5, 10, 9, 8, 7, 6, 21]

[3, 4, 5, 5, 10, 9, 8, 7, 6, 21]



* */