import java.io.*;
public class LogAnalyzer {
public static void main(){
    int errorcount=0;
    int warncount=0;
    int infocount=0;

   try{
   FileInputStream file = new FileInputStream("src/log.txt");
   InputStreamReader reader= new InputStreamReader(file);
   BufferedReader br = new BufferedReader(reader);
   if(new File("src/log.txt").length()==0){
       throw new IOException("File is Empty.");
   }
   String line;
   System.out.println("Analyzing: ");
   while((line=br.readLine())!=null){
       System.out.println(line);
       if(line.contains("ERROR")){
           errorcount++;
       }
       if(line.contains("INFO")){
           infocount++;
       }
       if(line.contains("WARNING")){
           warncount++;
       }
   }
   br.close();
   System.out.println("Result: ");
   System.out.println("Error Count: "+errorcount);
   System.out.println("Info Count: "+infocount);
   System.out.println("Warning Count: "+warncount);

}catch(IOException e){
       System.out.println(e.getMessage());
   }
}
}
