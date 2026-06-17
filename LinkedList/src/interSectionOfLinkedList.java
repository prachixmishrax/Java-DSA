public class interSectionOfLinkedList {
   public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }

    }

    public static void display(Node head){
       Node temp = head;
       while(temp!=null){
           System.out.print(temp.data+" ");
           temp = temp.next;
       }
    }

    public static int size(Node head) {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }
    public static Node InterSectionOfTwoLinkedList(Node head1,Node head2){
       int  m = interSectionOfLinkedList.size(head1);
        int  n = interSectionOfLinkedList.size(head2);

        Node temp1= head1;
        Node temp2= head2;
        if (m>n) {
            for (int i = 1; i <=m-n ; i++) {
                temp1=temp1.next;
            }
        }else {
            for (int i = 1; i <=n-m ; i++) {
                temp2=temp2.next;
            }
        }
        while(temp1!=temp2){
            temp1=temp1.next;
            temp2=temp2.next;

        }

         return temp1;

    }

    public static void main(String[] args) {
        Node a =  new Node(10);
        Node b =  new Node(20);
        Node c =  new Node(30);
        Node d =  new Node(40);
        Node e =  new Node(50);
        Node f =  new Node(60);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        Node a1 =  new Node(900);
        Node b1=  new Node(2000);
        Node c1=  new Node(40);
        Node d1=  new Node(50);
        Node e1=  new Node(60);
        a1.next = b1;
        b1.next = c1;
        c1.next = d1;
        d1.next = e1;
        interSectionOfLinkedList.display(interSectionOfLinkedList.InterSectionOfTwoLinkedList(a,a1));
    }
}
