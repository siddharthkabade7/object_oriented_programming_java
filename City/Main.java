import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        city[] c = new city[5];

        for(int i=0;i<5;i++){
            c[i] = new city();
            c[i].getcity(sc);
        }
        System.out.print("Details :");
        for(int i=0;i<5;i++){
            c[i].display();
        }

    }
}