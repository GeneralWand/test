

public class LinkedList
{
Node head;

public void insert(int value)
{
 Node node = new Node();
 node.data = value;
 node.next = null;
 
 if(head == null)
 {
   head = node;
 }
 
 else
 {
 Node currentNode = head;
 while(currentNode.next != null)
 {
   currentNode = currentNode.next;
 }
 currentNode.next = node;
 }
 }
 
 
 public void insertAtFirst(int value)
 {
   Node node= new Node();
   node.data = value;
   node.next = null;
   
   node.next = head;
   head = node;
 }
 
 public void insertAtFirst(int index, int data)
 {
   Node node = new Node();
   node.data = data;
   node.next = null;
   node.next = head;
   head = node;
   
   
 }
 
 public void insertAt(int index, int value)
 {
    Node node = new Node();
   node.data = value;
   node.next = null;
   
   if(index==0)
   {
      insertAtFirst(value);
   }
   
   Node n = head;
   for(int i = 0; i < index-1; i++)
   {
      n = n.next;
   }
   node.next = n.next;
   n.next = node;
 }
 
 public void Delete(int index)
 {
 if(index==0)
 {
   head = head.next;
 }
 else
 {
   Node n = head;
   Node n1 = null;
   for(int i = 0; i < index-1; i++)
   {
      n = n.next;
   }
   n1 = n.next;
   n.next = n1.next;
   //System.out.println("N1" + n1.data);
   n1 = null;
   }
   } 
 
 public void Show()
 {
   Node currentNode = head;
   while(currentNode.next != null)
   {
   System.out.println(currentNode.data);
   currentNode = currentNode.next;
   }
    System.out.println(currentNode.data);
   
 }
 
 
 
 
  
 public static void main(String[] args)
 {
   LinkedList list = new LinkedList();
   list.insert(4);
   list.insert(58);
   list.insert(90);
   list.insertAtFirst(910);
   list.insertAt(2,100);
   
   list.Show();
   list.Delete(1);
   
   list.Show();
   }
   }
   
   
   
 