public class supervisor extends Employee {
    supervisor(int id, String name, String address, String department, double Basic_pay) {
        super(id, name, address, department, Basic_pay);
    }

    @Override

    double calculate_Salary() {
        return basicpay + (basicpay * 0.2);

    }

}
