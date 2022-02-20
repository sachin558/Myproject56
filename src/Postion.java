import org.w3c.dom.Node;

public class Postion {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void push(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
        public void insertAtpostin(int pos,Node newNode) {
            Node temp = head;
            for (int i = 1; i < pos - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }

        public void display() {
            Node temp1 = head;
            while (temp1 != null) {
                System.out.println(temp1.data + " ");
                temp1 = temp1.next;
            }
        }

    public static void main(String[] args) {
        Postion obj=new Postion();
        obj.push(10);
        obj.push(20);
        obj.push(40);
        obj.insertAtpostin(2,null);
    }
    }


