public class Multiplication extends Thread {

    int[][] A, B, C;
    int row, col;

    void matrixtask(int[][] A,int[][] B,int[][] C,int row,int col){
        this.A=A;this.B=B;
        this.C=C;this.row=row;this.col=col;
    }

    public void run() {
        int sum = 0;
        for (int k = 0; k < B.length; k++) {
            sum += A[row][k] + B[k][col];
        }
        C[row][col] = sum;
    }

}
