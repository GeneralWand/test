public class Linked
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
          Node node = new Node();
          node.data = value;
          node.next = null;
          
          node.next = head;
          head = node;
          }
          
          public void Delete(int index)
          {
            if(index == 0)
            {
               head = head.next;
               }
               else
               {
               Node n = head;
               Node n1 = null;
               for(int i=0; i<index; i++)
               {
                n = n.next;
                }
                n1 = n.next;
                n.next = n1.next;
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
               Linked list = new Linked();
               list.insert(53);
               list.insert(803);
               list.insert(46);
               list.insertAtFirst(11);
               list.Delete(0);
               list.Show();

                }
               
          }