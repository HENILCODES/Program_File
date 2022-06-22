class Node{
    int data; //info
    Node n;  // addres
    public Node(int da){
        this.data = da;
    }
}
class Ins{
    Node head;
    public void app(int d){
        if ( head == null){
            head = new Node(d);
            return;
        }
        Node cur= head;
        while (cur.n != null) {
            cur = cur.n;
        }
        cur.n = new Node(d);
    }

    public void disp(){
        Node curr = head;
        while (curr.n != null) {
            System.out.println(curr.data);
            curr = curr.n;
        }
        System.out.println(curr.data);
    }
}
class in{
    public static void main(String[] args) {
        Ins e = new Ins();
        e.app(10);
        e.app(10);
        e.app(10);
        e.app(20);
        e.disp();
    }
}