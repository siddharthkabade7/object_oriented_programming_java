import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Worker");
            System.out.println("2. Supervisor");
            System.out.println("3. Manager");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int ch = sc.nextInt();

            if (ch == 4) {
                System.out.println("Thank you!");
                sc.close();
                return;
            }

            if (ch < 1 || ch > 3) {
                System.out.println("Invalid choice");
                continue;
            }

            System.out.print("Enter ID: ");
            int id = sc.nextInt();

            System.out.print("Enter name: ");
            String name = sc.next();

            System.out.print("Enter address: ");
            String address = sc.next();

            System.out.print("Enter department: ");
            String department = sc.next();

            System.out.print("Enter basic pay: ");
            double basicpay = sc.nextDouble();

            Employee e;

            switch (ch) {
                case 1:
                    e = new worker(id, name, address, department, basicpay);
                    break;
                case 2:
                    e = new supervisor(id, name, address, department, basicpay);
                    break;
                default:
                    e = new manager(id, name, address, department, basicpay);
                    break;
            }

            e.displayDetails();
            System.out.println("Salary: " + e.calculate_Salary());
        }
    }
}