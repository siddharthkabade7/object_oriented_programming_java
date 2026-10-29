import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1.Circle");
            System.out.println("2.Rectangle");
            System.out.println("3.Exit");

            System.out.println("Enter choice:");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    circle c = new circle();
                    System.out.println("Enter Radius :");
                    int r = sc.nextInt();
                    c.area(r);
                    c.perimeter(r);

                    break;
                case 2:
                    squre sq = new squre();
                    System.out.println("Enter Length:");
                    int l = sc.nextInt();
                    System.out.println("Enter Length:");
                    int  b = sc.nextInt();
                    sq.area(l,b);
                    sq.perimeter(l,b);

                    break;
                case 3:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }

        

    }

}
