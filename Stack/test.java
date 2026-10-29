public class test {
    int arr[] = new int[3];
    int top = -1;

    void push(int value) {
        try {
            if (top == arr.length - 1) {
                System.out.println("Stack overflow..");
            }
            arr[++top] = value;
            System.out.println("Pushed value: " + value);
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }

    void pop() {
        try {
            if (top == -1) {
                throw new Exception("Stack Underflow...");
            }
            System.out.println("Poped value :" + arr[top--]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    void display(){
        try{
            if(top==-1){
            throw new Exception("Stack is empty...");
        }
        for(int i=top;i>=0;i--){
            System.out.println(arr[i]);
        }
    }catch(Exception e){
        System.out.println(e.getMessage());
    }

    }

}
