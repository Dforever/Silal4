public class Stack {
 private ListNode headNode;



public Stack() {
 headNode = null;

}

//print the list in the forward direction
public void print() {
 ListNode element = headNode;
 while (element != null)
 {
  System.out.print(element.getInfo());
  if (element.getTail() != null)
   System.out.print(" <= ");
  element = element.getTail();
 }
 System.out.print("\n");
}



//Find the size of the list
public int size() {
 ListNode element = headNode;
 int count = 0;
 //go through each element
 while (element != null)
 {
  count = count + 1;
  element = element.getTail();
 }
 return count;
}

public String peek() {
 if (headNode == null)
  return null;
  return headNode.getInfo();
 }

public void push(String item) {
 ListNode newNode = new ListNode(item);
 if (headNode == null) {
  headNode = newNode;
 } else {
  newNode.setTail(headNode);
  headNode = newNode;
 }

}

public String pop() {
  if (headNode == null) {
   return null;
  } else {
   String curr = headNode.getInfo();
   headNode = headNode.getTail();
   return curr;

  }
}

}
