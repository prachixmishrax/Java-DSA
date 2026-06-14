public class deleteNthNodeFromEnd {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next=null;
        }
    }
        public static Node removeNthFromEnd(Node head, int n) {
            Node slow = head;
            Node fast = head;



            for (int i = 1; i <= n; i++) {
                fast = fast.next;
            }
            if (fast == head) {
                head = head.next;
                return head;
            }
//            if(fast == null) return head.next;
            while (fast.next != null) {
                fast = fast.next;
                slow = slow.next;
            }
            slow.next = slow.next.next;
            return head;
        }

  public static void display(Node head){
        deleteNthNodeFromEnd.Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f= new Node(60);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        deleteNthNodeFromEnd.display(a);
       a= deleteNthNodeFromEnd.removeNthFromEnd(a,6);
        System.out.println();
        deleteNthNodeFromEnd.display(a);
    }

}
