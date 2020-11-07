public class DoublyListTester{
    public static void main(String [] args){
        
        System.out.println("\n/////  Test 01  /////");
        Object [] a1 = {10,20,30,40};
        DoublyList h1 = new DoublyList(a1); // Creates a linked list using the values from the array
        // head will refer to the Node that contains the element from a[0]
        
        h1.forwardprint(); // This should print: 10,20,30,40. 
        h1.backwardprint(); // This should print: 40,30,20,10. 
        System.out.println(h1.countNode()); // This should print: 4
        
        System.out.println("\n/////  Test 02  /////");
        // returns the reference of the Node at the given index. For invalid idx return null.
        Node myNode = h1.nodeAt(2);
        System.out.println(myNode.element); // This should print: 30. In case of invalid index This will
        // generate nullPointerException.
        
        System.out.println("\n/////  Test 03  /////");
        // returns the index of the Node containing the given element.
        // if the element does not exist in the List, return -1.
        int index = h1.indexOf(40);
        System.out.println(index); // This should print: 3. In case of element that 
        //doesn't exists in the list this will print -1.
        
        System.out.println("\n/////  Test 04  /////");
        
        Object [] a2 = {10,20,30,40};
        DoublyList h2 = new DoublyList(a2); // uses the first constructor: LinkedList(Object [] a)
        h2.forwardprint(); // This should print: 10,20,30,40.  
        
        // inserts Node containing the given element at the given index. Check validity of index.
        h2.insert(85,0);
        h2.forwardprint(); // This should print: 85,10,20,30,40. 
        h2.backwardprint(); // This should print: 40,30,20,10,85.
        
        System.out.println();
        h2.insert(95,3);
        h2.forwardprint(); // This should print: 85,10,20,95,30,40.  
        h2.backwardprint(); // This should print: 40,30,95,20,10,80.  
        
        System.out.println();
        h2.insert(75,6);
        h2.forwardprint(); // This should print: 85,10,20,95,30,40,75. 
        h2.backwardprint(); // This should print: 75,40,30,95,20,10,85. 
        
        
        System.out.println("\n/////  Test 05  /////");
        Object [] a3 = {10,20,30,40,50,60,70};
        DoublyList h3 = new DoublyList(a3); // uses the first constructor: LinkedList(Object [] a)
        h3.forwardprint(); // This should print: 10,20,30,40,50,60,70.  
        
        /* removes Node at the given index. returns element of the removed node.
         * Check validity of index. return null if index is invalid.
         */
        System.out.println("Removed element: "+ h3.remove(0)); // This should print: Removed element: 10
        h3.forwardprint(); // This should print: 20,30,40,50,60,70.  
        h3.backwardprint(); // This should print: 70,60,50,40,30,20.  
        System.out.println("Removed element: "+ h3.remove(3)); // This should print: Removed element: 50
        h3.forwardprint(); // This should print: 20,30,40,60,70.  
        h3.backwardprint(); // This should print: 70,60,40,30,20.  
        System.out.println("Removed element: "+ h3.remove(4)); // This should print: Removed element: 70
        h3.forwardprint(); // This should print: 20,30,40,60. 
        h3.backwardprint(); // This should print: 60,40,30,20.  
        
        
        
        
    }
    
}