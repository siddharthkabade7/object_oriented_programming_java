import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class text {
    public static void main(String[] args){
        int error = 0,warning = 0;
         try{
            FileReader fr = new FileReader("log.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;
            while((line = br.readLine()) != null){
                if(line.contains("ERROR")){
                    error++;
                }
                if(line.contains("WARNING")){
                    warning++;
                }


            }
            br.close();
            System.out.println("\nERRORS :"+error);
            System.out.println("WARNINGS :"+warning);

         }catch(IOException e){
            System.out.println("Input output exception");
         }catch(Exception e){
            System.out.print(e);
         }
    }
    
}
