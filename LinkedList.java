class LinkedList{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;
    public void insert(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }
    public void delete(int key){
        Node temp=head,prev=null;
        if(temp!=null&&temp.data==key){
            head=temp.next;
            return;
        }
        while(temp!=null&&temp.data!=key){
            prev=temp;
            temp=temp.next;
        }
        if(temp==null)return;
        prev.next=temp.next;
    }
    public void display(){
        Node temp=head;
        if(temp==null){
            System.out.println("List is empty");
            return;
        }
        System.out.print("Linked List:");
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
    public static void main(String args[]){
        LinkedList list=new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.display();
        list.delete(20);
        list.display();
    }
}