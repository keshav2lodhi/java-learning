package datastructures.linkedlist;

import java.util.HashMap;
import java.util.Map;

/**
 * A program to clone/copy a linked-list to another
 **/
class Node {
    int data;
    Node next, random;

    public Node(int data) {
        this.data = data;
        this.next = this.random = null;
    }
}

class LinkedList {

    Node head;

    public LinkedList(Node head) {
        this.head = head;
    }

    public void push(int data) {
        Node node = new Node(data);
        node.next = this.head;
        this.head = node;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            Node random = temp.random;
            int randomData = (random != null) ? random.data : -1;
            System.out.println("Data:---> " + temp.data + ", Random data:---> " + randomData);
            temp = temp.next;
        }
    }

    public LinkedList clone() {
        Node originalCurr = this.head, cloneCurr = null;
        Map<Node, Node> map = new HashMap<>();

        while (originalCurr != null) {
            cloneCurr = new Node(originalCurr.data);
            map.put(originalCurr, cloneCurr);
            originalCurr = originalCurr.next;
        }

        originalCurr = this.head;

        while (originalCurr != null) {
            cloneCurr = map.get(originalCurr);
            cloneCurr.next = map.get(originalCurr.next);
            cloneCurr.random = map.get(originalCurr.random);

            originalCurr = originalCurr.next;
        }
        return new LinkedList(map.get(this.head));
    }
}

class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(new Node(5));
        list.push(4);
        list.push(3);
        list.push(2);
        list.push(1);

        // 1's random is 3
        list.head.random = list.head.next.next;
        // 2's random is 4
        list.head.next.random = list.head.next.next.next;
        // 3's random is 5
        list.head.next.next.random = list.head.next.next.next.next;
        // 4's random is -1
        list.head.next.next.next.random = list.head.next.next.next.next.next;
        // 5's random is 2
        list.head.next.next.next.next.random = list.head.next;

        System.out.println("@@@@@The original list");
        list.print();

        System.out.println("@@@@@The cloned list");
        LinkedList clone = list.clone();
        clone.print();
    }
}
