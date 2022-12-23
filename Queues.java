import java.util.Scanner;
class que{
    int rear=0;
    int front=0;
}
class Operations_Queues extends que{
    Scanner g=new Scanner(System.in);
    void Enqueue(int ls[],int m){
        if(rear>m-1){
            System.out.println("Overflow");
        }
        else{
            System.out.println("Enter the element ");
            int ele=g.nextInt();
            ls[rear]=ele;
            rear++;
        }
    }
    void Dequeue(int ls[]){
        if(front>rear||front==rear){
            System.out.println("Underflow!!!");
        }
        else{
            System.out.println("The element that will be dequeued is "+ls[front]);
            front++;
        }

    }
    void Peek(int ls[]){
        if(rear==0){
            System.out.println("The Queue is Empty ");
        }
        else{
            System.out.println("The front most element in the queue is "+ls[front]);
        }
    }
    void Display(int ls[]){
        if(front==0 && rear==0){
            System.out.println("Queue is Empty ");
        }
        else{
            System.out.println("The Queue looks this way ");
            for(int i=front;i<rear;i++){
                System.out.print("\t  \n"+ls[i]);
            }
        }
    }
}
public class Queues {
    public static void main(String[] args) {
        Scanner d=new Scanner(System.in);
        Operations_Queues ops=new Operations_Queues();
        System.out.println("Enter the number of elements ");
        int n=d.nextInt();
        int queue[]=new int[n];
        System.out.println("\n1. Enqueue \n2. Dequeue \n3. Peek \n4. Display \n5. Exit");
        int ch,c=1;
        while(c>0){
            System.out.print("Enter your choice ");
            ch=d.nextInt();
            switch(ch){
                case 1:
                    ops.Enqueue(queue,n);
                    break;
                case 2:
                    ops.Dequeue(queue);
                    break;
                case 3:
                    ops.Peek(queue);
                    break;
                case 4:
                    ops.Display(queue);
                    break;
            }
            if(ch==5) {
                System.out.println("Thank You!!!");
                break;
            }
        }
    }
}
