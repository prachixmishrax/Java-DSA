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
       void insertAtBig(int data){
           Node x = new Node(data);
           if(head == null){
               head=x;
               tail=x;
           }else{
               x.next=head;
               head=x;
           }
       }
       void insertAtIndex(int id,int data){

           Node x = new Node(data);
           Node temp = head;
           if(id==0){
               insertAtBig(data);
               return;
           }
           if(id==size()){
               insertAtEnd(data);
               return;
           }
           if(id>size()||id<0){
               System.out.println("invalidindex");
           }
           for (int i = 0; i < id-1; i++) {
                    temp=temp.next;

           }
                    x.next=temp.next;
                    temp.next=x;

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
             displayrec(head.next);
             System.out.print(head.data+" ");
         }
    }

    public static void main(String[] args) {
        linkedlist list = new linkedlist();

        list.insertAtEnd(20);
        list.insertAtBig(20000);
        list.insertAtEnd(30);
        list.insertAtEnd(29);
        list.insertAtEnd(200);
        list.display();
        System.out.println();
        System.out.println(list.size());
        list.displayrec(list.head);
        System.out.println();
        list.insertAtBig(300);
        list.display();
        list.insertAtIndex(3,799);
        System.out.println();
        list.display();
    }
}
