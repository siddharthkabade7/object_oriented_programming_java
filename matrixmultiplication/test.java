package matrixmultiplication;

public class test {
    public static void main(String[] args){
        try{
        int A[][] = {{1,2},{2,1}};
        int B[][]  ={{2,1},{1,2}};

        if(A[0].length!=B[0].length){
            throw new Exception("Invalid Dimenssion..");
        }

        int C[][] = new int[A.length][B[0].length];

        Multiplication[][] t = new Multiplication[A.length][B[0].length];

        for(int i=0;i<A.length;i++){
            for(int j=0;j<B[0].length;j++){
                t[i][j] = new Multiplication(); // thread 
                t[i][j].matrixtask(A, B, C, i, j);
                t[i][j].start();
            }
        }
        for(int i=0;i<A.length;i++){
            for(int j=0;j<B[0].length;j++){
                t[i][j].join();

            }
        }

        System.out.println("Reslutant matrix is :");
        for(int i=0;i<C.length;i++){
            for(int j=0;j<C[0].length;j++){
                System.out.print(C[i][j]+ " ");
            }
            System.out.println();

        }

        }catch(InterruptedException e){
            System.out.print("Thread Intrupted!");
        }catch(Exception e){
            System.out.print(e.getMessage());

        }

    }

}
