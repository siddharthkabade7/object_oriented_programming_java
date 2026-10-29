class MatrixMultiplication{
    static int[][] Multiply(int [][]A, int [][]B) throws InterruptedException{
        int rowsA=A.length;
        int colsA=A[0].length;
        int rowsB=B.length;
        int colsB=B[0].length;

        if(colsA!=rowsB){
            throw new IllegalArgumentException("Matrix Multiplication not possible.");
        }
        int[][]C=new int[rowsA][colsB];
        Thread[] threads = new Thread[rowsA];
        for(int i=0;i<rowsA;i++){
            final int rows=i;
            threads[i]=new Thread(()->{
                for(int j=0;j<colsB;j++){
                    for(int k=0;k<colsA;k++){
                        C[rows][j]+=A[rows][k]*B[k][j];
                    }
                }
            });
            threads[i].start();
        }
        for(int i=0;i<rowsA;i++){
            threads[i].join();
        }
        return C;
    }
}



