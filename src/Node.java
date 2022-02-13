public class Node {
    int data;
    Node next,n1,n2;

public  Node(int data) {
    this.data=data;
}

    public static void main(String[] args) {
        Node n1=new Node(10);
        Node n2=new Node(20);
        n1.next=n2;
        System.out.println(n1.data+" "+n1.next.data);

    }
}
