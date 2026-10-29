import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("\n--- MENU---\n");
            System.out.print("\n1. Circle");
            System.out.print("\n2. Rectangle");
            System.out.print("\n3.  EXIT...");

            System.out.print("\nEnter choice :");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    circle c = new circle();
                    System.out.print("Enter Radius :");
                    int r = sc.nextInt();
                    c.area(r);
                    c.perimeter(r);

                    break;
                case 2:
                    rectangle rect = new rectangle();
                    System.out.print("Enter lenght:");
                    int l = sc.nextInt();
                    System.out.print("Enter breadth:");
                    int b = sc.nextInt();
                    rect.area(l, b);

                    rect.perimeter(l, b);

                case 3:
                    System.out.print("Exiting...");
                    sc.close();
                    return ;
                    
                default:
                    break;
            }
            
                    

        }
    }

}
