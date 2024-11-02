
//node ) and the starting node is called HEAD and the last node is called TAIL and last node next node will 
// be NULL.
//the class name we cant keep it as LinkedList

//how can i make this dynamically typed 
public class LL{
    Node head;
    private int size;
    LL(){
        this.size = 0;
    }
    class Node{
        int data;
        Node next;

     //constructor
      public Node(int data){
        this.data = data;
        this.next = null;
        size++;
      }
        
    }
    //add
    //add first
    public void addfirst(int data){
        //base case - check whether the ll is there are not
        Node nd = new Node(data);
        if(head == null){
            head = nd;
            return;
        }
        nd.next = head;
        head = nd;
    }
    //add last
    public void addlast(int data){
        //base case - check whether the ll is there are not
        Node nd = new Node(data);
        if(head == null){
            head = nd;
            return;
        }
        Node currnd = head;//as i cant change the head, so creat a reference head variabel
        //to reach last node
        while(currnd.next != null){
            currnd = currnd.next;
        }
        currnd.next = nd;

    }
    public void print_nodes(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }

        Node currnd = head;
        while(currnd != null){
            System.out.print(currnd.data + "->");
            currnd = currnd.next;
        }
        System.out.println("null");
    }
    //delete
    //delete first
    public void deletefirst(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        size--;
        Node  currNode = head;
        head = currNode.next;
    }
    //delete last
    public void deltelast(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        size--;
        //if there is only one node and the next node is null and and if we acess null next we get eroor
        //to over come we write this
        if(head.next == null){
            head = null;
            return;
        }
        Node lastNode = head.next;
        Node lastSecondNode = head;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            lastSecondNode = lastSecondNode.next;
        }
        lastSecondNode.next = null;
    }
    public int getsize(){
        return size;
    }
    public static void main(String[] args) {
        LL  ll = new LL();
        ll.addfirst(1);
        ll.addlast(2);
        ll.addfirst(0);
        ll.addlast(3);
        ll.deletefirst();
        ll.deltelast();
        ll.print_nodes();
        System.out.println("size of ll is " + ll.getsize());
        
    }
}