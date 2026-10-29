    public class Main {
        public static void main(String[] args){
            try{
                int A[][]={{1,2,3},{4,5,6},{7,8,9}};
                int B[][]={{1,2,3},{4,5,6},{7,11,12}};

                if(A[0].length!=B.length){
                    throw new Exception("Matrix Multiplication Not Possibal invalid dimenssion ");
                }

                int[][] C = new int[A.length][B[0].length];
                Multiplication[][] t = new Multiplication[A.length][B[0].length];// matrix of threads

                for(int i=0;i<A.length;i++){  // loop for rows of A
                    for(int j=0;j<B[0].length;j++){  // loop for columns of B
                        t[i][j] = new Multiplication(); // create thread for each element of result matrix
                        t[i][j].matrixtask(A, B, C, i, j); // pass the required data to thread
                        t[i][j].start();  // start the thread  
                    }// total threads created = rows of A * columns of B i.e 9
                }
                for(int i=0;i<A.length;i++){
                    for(int j=0;j<B[0].length;j++){
                        t[i][j].join();  // wait for all threads to finish execution before printing the result
                    }
                }
                System.out.println("RESULT MATRIX :");
                for(int i=0;i<C.length;i++){
                    for(int j=0;j<C[0].length;j++){
                        System.out.print(C[i][j] + " ");
                    }
                    System.out.println();
                }
            }catch(InterruptedException e){
                System.out.print("Thread interrupted");
            }
            catch(Exception e){
                System.out.print(e.getMessage());
            }
        }

    }
