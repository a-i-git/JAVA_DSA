import java.util.Scanner;
class sta{
    int top=0;
}
class Operations_Stack extends sta{
    Scanner s=new Scanner(System.in);
    void Push(int ls[],int m){
        if(top>m-1){
            System.out.println("Overflow");
        }
        else{
            System.out.print("Enter the element you want to push ");
            int ele=s.nextInt();
            ls[top]=ele;
            top++;
            System.out.println("top is "+top);
        }
    }
    void Peek(int ls[]){
        if(top==0){
            System.out.println("Stack is Empty ");
        }
        else{
            System.out.println("Top is "+top);
            System.out.println("The element at the top of the stack is "+ls[top-1]);
        }
    }
    void Pop(int ls[]){
        if(top==0){
            System.out.println("Underflow");
        }
        else{
            System.out.println("The element that will be popped is "+ls[top-1]);
            top--;
        }
    }
    void Display(int ls[]){
        if(top==0){
            System.out.println("Stack is Empty");
        }
        else{
            System.out.println("Stack looks this way ");
            for(int i=top-1;i>=0;i--){
                System.out.println(" "+ls[i]);
            }
        }
    }
}

public class Stack {
    public static void main(String[] args) {
        Scanner d=new Scanner(System.in);
        Operations_Stack ops=new Operations_Stack();
        System.out.println("Enter the elements ");
        int num=d.nextInt();
        int arr[]=new int[num];
        int ch,c=1;
        System.out.println("\n 1.Push \n2. Peek \n3. Pop \n4. Display \n 5. Exit");
        while(c>0){
            System.out.print("Enter your choice ");
            ch=d.nextInt();
            switch(ch){
                case 1:
                    ops.Push(arr,num);
                    break;
                case 2:
                    ops.Peek(arr);
                    break;
                case 3:
                    ops.Pop(arr);
                    break;
                case 4:
                    ops.Display(arr);
                    break;
            }
            if(ch==5){
                System.out.println("Thank You!!!");
                break;
            }
        }
    }
}
