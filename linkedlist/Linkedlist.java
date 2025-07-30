public class Linkedlist {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int c = 0;

    public void addfirst(int data) {
        Node newNode = new Node(data);
        c++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addlast(int data) {
        Node newNode = new Node(data);
        c++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void addmid(int index, int data) {
        if (index == 0) {
            addfirst(data);
            return;
        }
        if (index >= c) {
            addlast(data);
            return;
        }
        Node newNode = new Node(data);
        c++;
        Node prev = head;
        for (int i = 0; i < index - 1; i++) {
            prev = prev.next;
        }
        newNode.next = prev.next;
        prev.next = newNode;
    }

    public int removefirst() {
        if (head == null) {
            System.out.println("List is empty");
            return -1;
        }
        int val = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        c--;
        return val;
    }

    public int removelast() {
        if (head == null) {
            System.out.println("List is empty");
            return -1;
        }
        if (head.next == null) {
            return removefirst();
        }
        Node prev = head;
        while (prev.next.next != null) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        c--;
        return val;
    }

    public int size() {
        return c;
    }

    public Node middleNode(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node mergesort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node mid = middleNode(head);
        Node rightHalf = mid.next;
        mid.next = null;

        Node leftSorted = mergesort(head);
        Node rightSorted = mergesort(rightHalf);
        return merge(leftSorted, rightSorted);
    }

    public Node merge(Node a, Node b) {
        Node dummy = new Node(0);
        Node tail = dummy;
        while (a != null && b != null) {
            if (a.data <= b.data) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }
        if (a != null) tail.next = a;
        if (b != null) tail.next = b;
        return dummy.next;
    }

    public void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.addfirst(5);
        ll.addfirst(10);
        ll.addlast(15);
        ll.addlast(56);
        ll.addmid(2, 20);
        ll.addfirst(1);
        ll.addfirst(7);
        ll.addfirst(4);
        ll.addfirst(5);
        ll.addfirst(2);
        ll.addfirst(67);

        System.out.println("Original List:");
        ll.printList(ll.head);

        ll.head = ll.mergesort(ll.head); // Sorting the list

        System.out.println("Sorted List:");
        ll.printList(ll.head);
    }
}
