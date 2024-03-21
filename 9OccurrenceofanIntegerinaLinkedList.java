/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}*/
// complete the below function
class Solution
{
    public static int count(Node head, int key)
    {
        //code here
        int count = 0;
        Node ptr =head;
        while(ptr != null){
            if(ptr.data == key){
                count++;
            }
            ptr = ptr.next;
        }
        return count;
        
        
    }
}
