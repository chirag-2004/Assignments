import java.util.Scanner;

class StackArray {
    int[] stack;
    int top;
    int size;

    StackArray(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            stack[top] = value;
            System.out.println(value + " pushed into stack");
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println(stack[top] + " popped from stack");
            top--;
        }
    }

    void peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Top element is: " + stack[top]);
        }
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Stack elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }
}

public class StackDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter stack size: ");
        int size = sc.nextInt();

        StackArray s = new StackArray(size);

        while (true) {
            System.out.println("\n1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    int value = sc.nextInt();
                    s.push(value);
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.peek();
                    break;
                case 4:
                    s.display();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}


/*

OUTPUT:

Enter stack size: 5

1. Push
2. Pop
3. Peek
4. Display
5. Exit
Choose option: 1
Enter value: 10
10 pushed into stack

1. Push
2. Pop
3. Peek
4. Display
5. Exit
Choose option: 1
Enter value: 20
20 pushed into stack

1. Push
2. Pop
3. Peek
4. Display
5. Exit
Choose option: 1
Enter value: 30
30 pushed into stack

1. Push
2. Pop
3. Peek
4. Display
5. Exit
Choose option: 4
Stack elements:
30
20
10

1. Push
2. Pop
3. Peek
4. Display
5. Exit
Choose option: 3
Top element is: 30

1. Push
2. Pop
3. Peek
4. Display
5. Exit
Choose option: 2
30 popped from stack

1. Push
2. Pop
3. Peek
4. Display
5. Exit
Choose option: 4
Stack elements:
20
10

1. Push
2. Pop
3. Peek
4. Display
5. Exit
Choose option: 5


*/
