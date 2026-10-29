import java.util.Scanner;

public class bank {
   private String name;
    private long accountnumber;
    private float balance;

    static int count = 0;

    public bank() {  

    }

    public String getname(){
        return name;
    }
    public long getaccountnumber(){
        return accountnumber;
    }
    public float getbalance(){
        return balance;
    }

    void addaccount(Scanner sc) {

        try{
            if(count>5){
            throw new ArrayIndexOutOfBoundsException("Account limit reached. Cannot add more accounts.");
            
        }
         System.out.print("Enter name of Account Holder :");
        name = sc.next();

        System.out.print("Enter account Number :");
        accountnumber = sc.nextLong();

        System.out.print("Enter Balance to Add:");
        balance = sc.nextFloat();

        count++;
        
        System.out.print("Account added...");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
       
    }

    void removeaccount() {

        name = " ";
        accountnumber = 0;
        balance = 0;
        count--;
        System.out.print("Accout removed succesfully..");

    }

    void depositemoney(Scanner sc) {
        System.out.print("Add balance :");
        double amount = sc.nextDouble();

        if (amount > 0) {
            balance += amount;
            System.out.print("Balance updated.." + balance);
        } else {
            System.out.print("Invalid Amount..");
        }
    }

    void withdrawmoney(Scanner sc) {
        System.out.print("Enter withdraw amount :");
        double amount = sc.nextDouble();

        if (amount <= 0) {
            System.out.print("Cant withdraw amount :");
        } else if (amount > balance) {
            System.out.print("Insufficent balance:");
        } else {
            balance -= amount;
            System.out.print("Balance updated.." + balance);
        }

    }

}
