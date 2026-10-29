import java.util.Scanner;
public class city{
    String name;
    long population;

    void getcity(Scanner sc){
        System.out.print("Enter city :");
        name = sc.next();
        System.out.print("Enter population :");
        population = sc.nextLong();
    }
    void display(){
        System.out.print("City :"+ name + "Population :"+ population);
    }
}