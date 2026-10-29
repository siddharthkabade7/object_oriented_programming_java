import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter rows for A:");
            int r1 = sc.nextInt();
            System.out.print("Enter coloums for A:");
            int c1 = sc.nextInt();
            System.out.print("Enter rows for B:");
            int r2 = sc.nextInt();
            System.out.print("Enter coloums for B:");
            int c2 = sc.nextInt();

            

            if (r1 <= 0 || c1 <= 0 || r2 <= 0 || c2 <= 0) {
                throw new Exception("Invalid matrix dimensions");
            }
            if (c1 != r2) {
                throw new Exception("Matrix Multiplication Not Possibal invalid dimenssion ");
            } 
            int[][] A = new int[r1][c1];
            int[][] B = new int[r2][c2];

                System.out.println("Enter Matrix A elements :");
                for (int i = 0; i < r1; i++) {
                    for (int j = 0; j < c1; j++) {
                        A[i][j] = sc.nextInt();
                    }
                }
                System.out.println("Enter Matrix B elements :");
                for (int i = 0; i < r2; i++) {
                    for (int j = 0; j < c2; j++) {
                        B[i][j] = sc.nextInt();
                    }
                }
            

            int[][] C = new int[r1][c2];
            Multiplication[][] t = new Multiplication[A.length][B[0].length];// matrix of threads

            for (int i = 0; i < r1; i++) { // loop for rows of A
                for (int j = 0; j < c2; j++) { // loop for columns of B
                    t[i][j] = new Multiplication(); // create thread for each element of result matrix
                    t[i][j].matrixtask(A, B, C, i, j); // pass the required data to thread
                    t[i][j].start(); // start the thread
                } // total threads created = rows of A * columns of B i.e 9
            }
            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < B[0].length; j++) {
                    t[i][j].join(); // wait for all threads to finish execution before printing the result
                }
            }
            System.out.println("RESULT MATRIX :");
            for (int i = 0; i < C.length; i++) {
                for (int j = 0; j < C[0].length; j++) {
                    System.out.print(C[i][j] + " ");
                }
                System.out.println();
            }
        } catch (InterruptedException e) {
            System.out.print("Thread interrupted");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }

}
