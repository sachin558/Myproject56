/*
insert the node at the beginning  and add the node after the preveouds node and add the node  last of the linked list
 */
import org.w3c.dom.*;
public class InsertAtpo {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next=head;
        head=newNode;
    }

    public void insertAter(Node preNode, int data) {
        if (preNode == null) {
            System.out.println("empty node can not add the linked list ");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = preNode.next;
        preNode.next = newNode;
    }
    public void insertAtLst(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=new Node(data);
            return;
        }
        newnode.next=null;
        Node last=head;
        while (last.next!=null)
            last=last.next;
        last.next=newnode;
        return;
    }
    public void printdisplay(){
        Node tnode=head;
        while (tnode!=null){
            System.out.print(tnode.data+" ");
            tnode=tnode.next;
        }
    }

    public static void main(String[] args) {
        InsertAtpo obj=new InsertAtpo();
        obj.insertAtLst(6);
        obj.push(7);
        obj.push(1);
        obj.insertAter(obj.head.next,8);
        obj.printdisplay();
    }
}

