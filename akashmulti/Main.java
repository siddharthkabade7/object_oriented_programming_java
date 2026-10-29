public class Main {
    public static void main(String[] args){
        int[][]A={
                {1,2},
                {3,4}
        };
        int[][]B={
                {4,5},
                {6,7}
        };

        try{
            int[][]C=MatrixMultiplication.Multiply(A,B);
            System.out.println("Resultant Matrix: ");
            for(int i=0;i<C.length;i++){
                for(int j=0;j<C[i].length;j++){
                    System.out.print(C[i][j]+" ");
                }
                System.out.println();
            }
        }catch(IllegalArgumentException e){
            System.out.println("Error: "+e.getMessage());
        }
        catch(InterruptedException e){

            System.out.println("Thread execution was interrupted.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
