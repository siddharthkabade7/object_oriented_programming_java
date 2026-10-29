public class Main {
    public static void main(String[] args) {
        Stack s = new Stack();
        test t = new test();

        // s.push(10);
        // s.push(20);
        // s.push(30);
        // s.push(40);  // Stack Overflow

        t.push(10);
        t.push(20);
        t.push(30);
        t.push(40);  

        System.out.println("Stack elements:");
        s.display();

        t.pop();
        t.pop();
        t.pop();
        t.pop();     // Stack Underflow
    }
}