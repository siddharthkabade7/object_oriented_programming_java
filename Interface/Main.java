import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        transport t;
        while (true) {
            System.out.println("1. Bus");
            System.out.println("2. Car");
            System.out.println("3. Train");
            System.out.println("4. Exit");

            System.out.println("Enter Distance :");
            int d = sc.nextInt();

            System.out.println("Enter choice:");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    t = new car();
                    System.out.println("Car fare :" + t.calculatefare(d));

                    break;
                case 2:
                    t = new bus();
                    System.out.println("Bus fare :"+t.calculatefare(d));
                    break;
                case 3:
                    t= new train();
                    System.out.println("Train fare :"+t.calculatefare(d));
                    break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.print("invalid choice..");
                    break;
            }

        }
    }

}
