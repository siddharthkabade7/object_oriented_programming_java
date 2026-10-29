import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Distance :");
        double distance = sc.nextDouble();

        if(distance<0){
            System.out.print("Distance cant negative:");
        }else{
            Transport transport;
            while(true){
                System.out.print("\n-----MENU-----\n");
                System.out.print("\n1. CAR:");
                System.out.print("\n2. BUS");
                System.out.print("\n3. Train");
                System.out.print("\n4. Exiting...");

                System.out.print("\n Enter Choice:");
                int ch = sc.nextInt();
                
                switch (ch){
                    case 1:
                        transport  = new car();
                        System.out.print("Car fare :"+ transport.calculatefare(distance));
                        break;
                    case 2:
                        transport = new bus();
                        System.out.print("Bus fare :"+ transport.calculatefare(distance));
                        break;
                    case 3:
                        transport = new train();
                        System.out.print("Train fare :"+ transport.calculatefare(distance));
                        break;
                    case 4:
                        System.out.print("\nExiting...");
                        sc.close();
                        return;
                    default:
                        System.out.print("Invalid choice:");
        
                }
            }
        }

    }
    
}
