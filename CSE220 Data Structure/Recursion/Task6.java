class Task7
{
    Node head;  
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
 
    void printReverse(Node head)
    {
        if (head == null) return;
        printReverse(head.next);
        System.out.print(head.data+" ");
    }

    public void insert(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    public static void main(String args[])
    {
        // Let us create linked list 1->2->3->4
        Task7 a=new Task7();
        int b[]={12,1,6,3,89,5};
        for(int i=0;i<b.length;++i){
        a.insert(b[i]);
        }
        a.printReverse(a.head);
    }
}