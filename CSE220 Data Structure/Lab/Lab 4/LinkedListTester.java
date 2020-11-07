public class LinkedListTester{
  public static void main(String [] args){
    
    System.out.println("\n/////  Test 01  /////");
    Object [] a1 = {10,20,30,40};
    LinkedList h1 = new LinkedList(a1); // Creates a linked list using the values from the array
    // head will refer to the Node that contains the element from a[0]
    
    h1.printList(); // This should print: 10,20,30,40. 
    System.out.println(h1.countNode()); // This should print: 4
    
    System.out.println("\n/////  Test 03  /////");
    // returns the reference of the Node at the given index. For invalid idx return null.
    Node myNode = h1.nodeAt(1);
    System.out.println(myNode.element); // This should print: 20. In case of invalid index This will
    // generate nullPointerException.
    
    System.out.println("\n/////  Test 04  /////");
    // returns the element of the Node at the given index. For invalid idx return null.
    Object val = h1.get(2);
    System.out.println(val); // This should print: 30. In case of invalid index This will print null.
    
    
    System.out.println("\n/////  Test 05  /////");
    
    /* updates the element of the Node at the given index. 
     * Returns the old element that was replaced. For invalid index return null.
     * parameter: index, new element
     */     
    System.out.println(h1.set(1,85)); // This should print: 20
    h1.printList(); // This should print: 10,85,30,40.
    System.out.println(h1.set(15,85)); // This should print: null
    h1.printList(); // This should print: 10,85,30,40. 
    
    System.out.println("\n/////  Test 06  /////");
    // returns the index of the Node containing the given element.
    // if the element does not exist in the List, return -1.
    int index = h1.indexOf(40);
    System.out.println(index); // This should print: 3. In case of element that 
    //doesn't exists in the list this will print -1.
    
    System.out.println("\n/////  Test 07  /////");
    // returns true if the element exists in the List, return false otherwise.
    boolean ask = h1.contains(40);
    System.out.println(ask); // This should print: true.
    
    
    System.out.println("\n/////  Test 08  /////");
    Object [] a2 = {10,20,30,40,50,60,70};
    LinkedList h2 = new LinkedList(a2); // uses the first constructor: LinkedList(Object [] a)
    h2.printList(); // This should print: 10,20,30,40,50,60,70.  
    // Makes a duplicate copy of the given List. Returns the head reference of the duplicate list.
    Node copyH=h2.copyList(); // Head node reference of the duplicate list
    LinkedList h3 = new LinkedList(copyH); // uses the second constructor: LinkedList(Node h)
    h3.printList(); // This should print: 10,20,30,40,50,60,70.  
    
    System.out.println("\n/////  Test 09  /////");
    Object [] a4 = {10,20,30,40,50};
    LinkedList h4 = new LinkedList(a4); // uses the first constructor: LinkedList(Object [] a)
    h4.printList(); // This should print: 10,20,30,40,50.  
    // Makes a reversed copy of the given List. Returns the head reference of the reversed list.
    Node revH=h4.reverseList(); // Head node reference of the reversed list
    LinkedList h5 = new LinkedList(revH); // uses the second constructor: LinkedList(Node h)
    h5.printList(); // This should print: 50,40,30,20,10.  
    
    System.out.println("\n/////  Test 10  /////");
    Object [] a6 = {10,20,30,40};
    LinkedList h6 = new LinkedList(a6); // uses the first constructor: LinkedList(Object [] a)
    h6.printList(); // This should print: 10,20,30,40.  
    
    // inserts Node containing the given element at the given index. Check validity of index.
    h6.insert(85,0);
    h6.printList(); // This should print: 85,10,20,30,40.  
    h6.insert(95,3);
    h6.printList(); // This should print: 85,10,20,95,30,40.  
    h6.insert(75,6);
    h6.printList(); // This should print: 85,10,20,95,30,40,75. 
    
    
    
    System.out.println("\n/////  Test 11  /////");
    Object [] a7 = {10,20,30,40,50,60,70};
    LinkedList h7 = new LinkedList(a7); // uses the first constructor: LinkedList(Object [] a)
    h7.printList(); // This should print: 10,20,30,40,50,60,70.  
    
    /* removes Node at the given index. returns element of the removed node.
     * Check validity of index. return null if index is invalid.
     */
    System.out.println("Removed element: "+ h7.remove(0)); // This should print: Removed element: 10
    h7.printList(); // This should print: 20,30,40,50,60,70.  
    System.out.println("Removed element: "+ h7.remove(3)); // This should print: Removed element: 50
    h7.printList(); // This should print: 20,30,40,60,70.  
    System.out.println("Removed element: "+ h7.remove(4)); // This should print: Removed element: 70
    h7.printList(); // This should print: 20,30,40,60. 
    
    
    System.out.println("\n/////  Test 11  /////");
    Object [] a8 = {10,20,30,40};
    LinkedList h8 = new LinkedList(a8); // uses the first constructor: LinkedList(Object [] a)
    h8.printList(); // This should print: 10,20,30,40.  
    
    // Rotates the list to the left by 1 position.
    h8.rotateLeft();
    h8.printList(); // This should print: 20,30,40,10.  
    
    
    System.out.println("\n/////  Test 12  /////");
    Object [] a9 = {10,20,30,40};
    LinkedList h9 = new LinkedList(a9); // uses the first constructor: LinkedList(Object [] a)
    h9.printList(); // This should print: 10,20,30,40.  
    
    // Rotates the list to the right by 1 position.
    h9.rotateRight();
    h9.printList(); // This should print: 40,10,20,30.  
    
    
  }
  
}