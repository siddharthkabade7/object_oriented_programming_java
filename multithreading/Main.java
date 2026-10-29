public class Main {
    public static void main(String[] args){
        try{
           int A[][] = {{1,2,3},{1,2,4},{2,3,4}};
           int B[][] = {{2,3,4},{4,5,6},{2,5,7}};
           
           if(A[0].length!=B.length){
            throw new Exception("Invalid dimenssion");
           }

           int C[][] = new int[A.length][B[0].length];  // declare resultant matrix
           Multiplication[][] t = new Multiplication[A.length][B[0].length]; // declare thread array

           for(int i=0;i<A.length;i++){ 
            for(int j=0;j<B[0].length;j++){
                t[i][j]= new Multiplication();
                t[i][j].matrixtask(A,B,C,i,j);
                t[i][j].start();  
            }
        }
        for(int i=0;i<A.length;i++){
            for(int j=0;j<B[0].length;j++){
                t[i][j].join();  // wait until one thread execucation complet
            }
           }
        
           for(int i=0;i<C.length;i++){
            for(int j=0;j<C[0].length;j++){
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
           }

        }catch(InterruptedException e){
            System.out.println();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
