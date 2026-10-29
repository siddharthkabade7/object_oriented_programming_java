public class Stack {
    int arr[] = new int[3];
    int top=-1;

    void push(int value){
        try{
        if(top == arr.length-1){
            throw new Exception("Stack overflow...");
        }
        
        arr[++top]=value;
        System.out.println("Value pushed :"+value);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    void pop(){
        try{
            if(top==-1){
                throw new Exception("Stack underflow...");
            }

            System.out.println("Value poped :"+arr[top--]);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    
}
