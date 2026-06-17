class Main{
    static class Node{
        Node prev;
        int data;
        Node next;
        Node(int data){
            this.prev=null;
            this.data= data;
            this.next=null;
        }
    }
    static void display(Node head){
        Node temp = head;
        while(temp!=null){
        System.out.print(temp.data+" ");
            temp= temp.next;
        }
    }
    static void displayrev(Node tail){
        Node temp = tail;
        while(temp!=null){
        System.out.print(temp.data+" ");
            temp= temp.prev;
        }
    }


    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);
        a.prev=null;
        a.next = b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=f;
        f.prev=e;
        f.next=null;
       Main.display(a);
        System.out.println();
       Main.displayrev(f);
    }
}
