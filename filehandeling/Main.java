import java.io.*;

public class Main{
    public static void main(String[] args){
        int errors=0,warnings=0,info=0;

        try{
            FileReader fr = new FileReader("log.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);

                if(line.contains("ERROR")){
                    errors++;
                }
                if(line.contains("WARNING")){
                    System.out.println("Warning message: " + line);
                    warnings++;
                }
            }
            br.close();

            BufferedWriter bw = new BufferedWriter(
                new FileWriter("summary1.txt")
            );

            bw.write("Total error message :"+ errors);
            bw.write("\nTotal warnings :"+warnings);

            bw.close();

            System.out.println("Summary written successfully..");
               


            System.out.println("\nERRORS :"+errors);
            System.out.println("WARNINGS :"+warnings);

        }catch(FileNotFoundException e){
            System.out.print("Input output exception");
        }catch(IOException e){
            System.out.print("Input output exception");
        }
    }
}