import java.io.*;
public class test {
    public static void main(String[] args){
        int error=0,warnings=0;
        try{
            FileReader fr = new FileReader("log.txt");
            BufferedReader br = new BufferedReader(fr);
            
            String line;
            while((line = br.readLine())!=null){
                System.out.println(line);

                if(line.contains("ERROR")){
                    error++;
                }
                if(line.contains("WARNING")){
                    warnings++;
                }
                br.close();

                System.out.println("Warnings : "+ warnings);
                System.out.println("Errors : "+ error);

            }
        }catch(IOException e){
            System.out.println("IO exception");
        }catch(Exception e){
            System.out.print(e.getMessage());
        }

    }
    
}
