/*


Input:
N = 2
LinkedList: 1->2->3->4->5->6->7->8->9
Output: 8
Explanation: In the first example, there
are 9 nodes in linked list and we need
to find 2nd node from end. 2nd node
from end os 8.


Input:
N = 5
LinkedList: 10->5->100->5
Output: -1
Explanation: In the second example, there
are 4 nodes in the linked list and we
need to find 5th from the end. Since 'n'
is more than the number of nodes in the
linked list, the output is -1.
*/

class GfG
{
    static int getLength(Node head) {
        if (head == null) {
            return 0;
        }
        int c=0;
        Node t;
        for(t=head; t!=null; t=t.next){
            c++;
        }
        return c;
    }
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
    	// Your code here	
    	int len = getLength(head);
        if (len < n) {
            return -1;
        }
        if (head == null) {
            return -1;
        }

        len = len-n;
        Node t=head;
        while(len != 0) {
            t=t.next;
            len--;
        }

        return t.data;
    }
}
