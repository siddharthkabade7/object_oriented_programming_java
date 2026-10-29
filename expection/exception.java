public class exception {
    void divide(){
        try{
            System.err.println(10/0);
        }catch(ArithmeticException e){
            System.out.print("cant divide by zero..");
            System.out.print("\n");
        }finally{
            System.out.print("FInally block");
            System.out.print("\n");
        }
    }
    void array(){
        try{
            int a[]={1,2,3,4};
            System.out.println(a[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.print("Array is of 3 index...");
            System.out.print("\n");
        }
    }

    void null_check(){
        try{
            String s = null;
            System.out.print(s.length());
        }catch(NullPointerException e){
            System.out.print("String is null...");
            System.out.print("\n");
        }
    }

    void check_age(){
        try{
            int age = 15;
            if(age < 18){
                throw new Exception("age is less than 18");
            }
        }
        catch(Exception e){ 
            System.out.print(e.getMessage());
            System.out.print("\n");
        }
    }
    
}
