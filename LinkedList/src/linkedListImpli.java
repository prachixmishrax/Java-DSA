public class linkedListImpli {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

   public static class linkedlist{
       Node head=null,tail=null;

       void insertAtEnd(int data){
           Node x = new Node(data);
           if(head == null){
               head=x;
               tail=x;
           }else{
               tail.next = x;
               tail=tail.next;
           }
       }
        void display(){
           Node temp=head;
           while(temp!=null){
               System.out.print(temp.data+" ");
               temp = temp.next;
           }

        }
         int size( ){
           Node temp = head;
           int count =0;
           while(temp!=null){
               count++;
               temp=temp.next;
           }
           return count;
         }
         void displayrec( Node head){

             if(head==null){
                 return;
             }
             System.out.print(head.data+" ");
             displayrec(head.next);
         }
    }

    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(29);
        list.insertAtEnd(200);
        list.display();
        System.out.println();
        System.out.println(list.size());
        list.displayrec(list.head);
    }
}
