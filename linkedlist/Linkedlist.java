
public class Linkedlist{
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
            
    }
    public static Node head;
    public static Node tail;

    public void addfirst(int data){
        Node newNode = new Node(data);

        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void addlast(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=tail=newnode;
            return; 
            }
            tail.next=newnode;
    }


    public static void main(String[] args) {
    Linkedlist ll=new Linkedlist();
    ll.addfirst(5);
    ll.addfirst(10);
    ll.addlast(15);
   
    Node temp = ll.head;
    while (temp != null) {
        System.out.print(temp.data + " -> ");
        temp = temp.next;
    }
    System.out.println("null");
}}
