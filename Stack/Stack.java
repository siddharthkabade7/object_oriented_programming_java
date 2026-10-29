public class Stack {
    int arr[] = new int[3];
    int top = -1;

    void push(int value) {
        try {
            if (top == arr.length - 1) {
                throw new Exception("Stack Overflow");
            }

            arr[++top] = value;
            System.out.println(value + " pushed");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    void pop() {
        try {
            if (top == -1) {
                throw new Exception("Stack Underflow");
            }

            System.out.println(arr[top--] + " popped");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }

        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}