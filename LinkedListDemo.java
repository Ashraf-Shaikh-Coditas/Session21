package Week5.Session21;
//1)Write a program of Linked List implementation of Queue.Try all the methods.

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListDemo {
    public static void main(String[] args) {
        Queue<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(5);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(10);
        list2.add(9);
        list2.add(null);
        list2.add(8);
        list2.add(7);
        list2.add(6);

        System.out.println("List 1 :: ");
        for (Integer i : list1) {
            System.out.println(i);
        }

        System.out.println("List 2 :: ");
        for (Integer i : list2) {
            System.out.println(i);
        }

        list1.addAll(list2);
        System.out.println("List 1 after list1.addAll(list2) :: ");
        for (Integer i : list1) {
            System.out.println(i);
        }

        System.out.println("Does list1 contains 3 :: "+list1.contains(3));
        System.out.println("Is list empty :: "+list1.isEmpty());
        System.out.println("Head :: "+list1.element());
        list1.offer(11);
        System.out.println("List after offer :: "+list1);
        System.out.println("Head is :: "+list1.peek());
        System.out.println("Removed Head using poll() : "+list1.poll());
        System.out.println("Removed Head using remove() : "+list1.remove());

        System.out.println("First Element in list2 is :: "+list2.getFirst());
        System.out.println("Last Element in list2 is :: "+list2.getLast());
        list2.addFirst(1);  // add at front
        list2.addLast(11);   // add at last
        System.out.println(list2);

        System.out.println("Head is :: list2.getElement() :: "+list2.element());
        System.out.println("Head is :: list2.peek() :: "+list2.peek());
        System.out.println("First Element in queue :: "+list2.peekFirst());
        System.out.println("Last Element in queue :: "+list2.peekLast());

        System.out.println("Removed Head :: "+list2.poll());
        System.out.println("Removed First Element :: "+list2.pollFirst());
        System.out.println("Removed Last Element :: "+list2.pollLast());
        System.out.println(list2);

        list2.offer(21);
        list2.offerFirst(1);
        list2.offerLast(22);
        System.out.println("After offer() operations :: "+list2);

        System.out.println("Removed First Element :: "+list2.pop());
        list2.push(1); // Adding at index 0 ;
        System.out.println(list2);

        list2.removeFirst();
        list2.removeLast();
        System.out.println("After removeFirst() and removeLast() :: "+list2);

        list2.removeFirstOccurrence(2);
        list2.removeLastOccurrence(22);
        System.out.println(list2);








    }
}

/* CONCLUSIONS :
   1) Null value      ==> ALLOWED
   2)Duplicate values ==> ALLOWED
   3) Order           ==> INSERTION ORDER

* */

/*
List 1 ::
1
2
3
4
5
5

List 2 ::
10
9
null
8
7
6

List 1 after list1.addAll(list2) ::
1
2
3
4
5
5
10
9
null
8
7
6

Does list1 contains 3 :: true
Is list empty :: false
Head :: 1
List after offer :: [1, 2, 3, 4, 5, 5, 10, 9, null, 8, 7, 6, 11]
Head is :: 1
Removed Head using poll() : 1
Removed Head using remove() : 2


First Element in list2 is :: 10
Last Element in list2 is :: 6
[1, 10, 9, null, 8, 7, 6, 11]

Head is :: list2.getElement() :: 1
Head is :: list2.peek() :: 1
First Element in queue :: 1
Last Element in queue :: 11

Removed Head :: 1
Removed First Element :: 10
Removed Last Element :: 11
[9, null, 8, 7, 6]

After offer() operations :: [1, 9, null, 8, 7, 6, 21, 22]

Removed First Element :: 1
[1, 9, null, 8, 7, 6, 21, 22]

After removeFirst() and removeLast() :: [9, null, 8, 7, 6, 21]

[9, null, 8, 7, 6, 21]

* */
