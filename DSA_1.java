import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
class Operations{
    Scanner i=new Scanner(System.in);
    void print_LL(Node head){
        while(head!=null){
            System.out.println("The data in the Node is "+head.data);
            head=head.next;
        }
    }
    Node addatthebeg(Node head){
        Node newnode=new Node(10);
        newnode.next=head;
        head=newnode;
        System.out.println("Now the head data is "+head.data);
        return head;
    }
    Node addattheend(Node head){
        Node ptr=head;
        while(head.next!=null){
            head=head.next;
        }
        Node newnode=new Node(20);
        head.next=newnode;
        newnode.next=null;
        return ptr;
    }
    Node addbeforeanode(Node head){
        Node ptr=head;
        Node temp=head;
        System.out.println("Enter the data of the node before the new_node will be inserted");
        int num;
        num=i.nextInt();
        Node newnode=new Node(num);
        while(ptr.data!=num){
            temp=ptr;
            ptr=ptr.next;
        }
        temp.next=newnode;
        newnode.next=ptr;
        return head;

    }
    Node delatbeg(Node head){
        Node ptr=head;
        head=head.next;
        return head;
    }
    Node delatend(Node head){
        //System.out.println("head"+head);
        Node ptr=head;
        Node temp=head;
        while(ptr.next!=null){
            temp=ptr;
            ptr=ptr.next;
        }
        temp.next=null;
        return head;

    }
}
public class DSA_1 {
    public static void main(String[] args) {
        Node node1=new Node(6);
        Node node2=new Node(4);
        Node node3=new Node(5);
        node1.next=node2;
        node2.next=node3;
        node3.next=null;
        Operations op=new Operations();
        //System.out.println("head"+node1);
        op.print_LL(node1);
        node1=op.addatthebeg(node1);
        //System.out.println(node1.data);
        op.print_LL(node1);
        op.addattheend(node1);
        op.print_LL(node1);
        op.addbeforeanode(node1);
        op.print_LL(node1);
        node1=op.delatbeg(node1);
        op.print_LL(node1);
        op.delatend(node1);
        op.print_LL(node1);
    }
}
