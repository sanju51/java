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
    public static int c;

    public void addfirst(int data){
        Node newNode = new Node(data);
        c++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void addlast(int data){
        Node newnode=new Node(data);
        c++;
        if(head==null){
            head=tail=newnode;
            return; 
            }
            tail.next=newnode;
            tail=newnode;
    }
    public void addmid(int index,int data){
        if(index==0){
            addfirst(data);
            return;
        }
        Node newNode = new Node(data);
        c++;
        Node prev=head;
        if(head==null){
            head=tail=newNode;
        }
        for(int i=0;i<index-1;i++){
            prev=prev.next;
        }
        newNode.next=prev.next;
        prev.next=newNode;
    }
    public int removefirst(){
        if(head==null){
            System.out.println("List is empty");
            return 0;
            }
            if(c==1){
                head=tail=null;
                c--;
                return 0;

            }
        Node prev=head;
        head=head.next;
        prev.next=null;
        c--;
        return prev.data;
    }

    public int removelast(){
        if(head==null){
            System.out.println("List is empty");
            return 0;
            }
            if(c==1){
                head=tail=null;
                c--;
                return 0;

            }
        Node prev=head;
        
        while(prev.next!=tail){
            prev=prev.next;
            

        }
        int val = tail.data; 
        prev.next = null; 
        tail = prev; 
        c--; 
    
        return val; 
    }

     public int search(int d){
         
        Node temp = head;
         int i=0;
         while(temp!=null){
             if(temp.data==d){
               return i;
           }
            temp=temp.next;
            i++;
        }
         return -1;
     }

    public int help(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int indx=help(head.next,key);
        if(indx==-1){
            return -1;
        }
        return indx+1;
    }
    public int recsearch(int d){
        return help(head,d);
    }

    public static void main(String[] args) {
    Linkedlist ll=new Linkedlist();
    ll.addfirst(5);
    ll.addfirst(10);
    ll.addlast(15);
    ll.addlast(56);
    ll.addmid(2, 20);
    int h=ll.removefirst();
    int j=ll.removelast();
   
    Node temp = ll.head;
    while (temp != null) {
        System.out.print(temp.data + " -> ");
        temp = temp.next;
    }
    System.out.println("null");
    System.out.println("Deleted node is " +h);
    System.out.println(c);
    System.out.println("Deleted node is " +j);
    int g=ll.search(15);
    System.out.println(g);
    int l=ll.recsearch(15);
    System.out.println(l);
    
}}
