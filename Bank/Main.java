import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        bank[] b = new bank[1];  // create an array of bank objects

        while (true) {
            System.out.print("\n1. Add acount");
            System.out.println("\n2. Remove Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Exit");

            System.out.print("Enter choice:");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    b[bank.count] = new bank();  // create a new bank object at the current count index
                    b[bank.count].addaccount(sc);

                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    long acc = sc.nextLong();
                    for (int i = 0; i < bank.count; i++) {
                        if (b[i].getaccountnumber() == acc) {
                            b[i].removeaccount();
                        }
                    }

                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    long acc1 = sc.nextLong();

                    for (int i = 0; i < bank.count; i++) {
                        if (b[i].getaccountnumber() == acc1) {
                            b[i].depositemoney(sc);
                            break;
                        }
                    }

                    break;
                case 4:
                    System.out.print("Enter Account Number: ");
                    long acc2 = sc.nextLong();

                    for (int i = 0; i < bank.count; i++) {
                        if (b[i].getaccountnumber() == acc2) {
                            b[i].withdrawmoney(sc);
                            break;
                        }
                    }

                    break;
                case 5:
                    System.out.println("Thank You");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice");

            }
        }

    }

}
