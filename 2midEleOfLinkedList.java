

class Node {
    int data;
    Node next;
};

class Main {
    static Node head = null;

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
    static void create(int n){
        head = new Node();
        head.data = n;
        head.next = null;
    }

    static void insert(int n) {
        if (head == null) {
            create(n);
            return;
        }

        Node newNode = new Node();
        newNode.data = n;
        newNode.next = head;
        head = newNode;
    }

    static void traverse() {
        if (head == null) {
            System.out.println("NOT traverse");
            return;
        }

        Node t = head;
        while (t != null) {
            System.out.print(t.data + " ");
            t = t.next;
        }
        System.out.println();
    }
    static int getNthFromLast() {
        int len = getLength(head);
       
        len = len / 2;

        Node t=head;
        while(len != 0) {
            t=t.next;
            len--;
        }

        return t.data;
    }

    public static void main(String[]args) {
        insert(30);
        insert(20);
        insert(10);
        insert(5);
        traverse();
        // System.out.println(getLength());
        System.out.println(getNthFromLast());
    }
}
