public class worker extends Employee {
    worker(int id, String name, String address,
           String department, double basicPay){
            super(id,name,address,department,basicPay);
           }
    @Override 
    double calculate_Salary() {
        return basicpay + (basicpay*0.1);
    }
    
}
