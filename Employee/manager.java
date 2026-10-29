public class manager extends Employee{
    manager(int id,String name,String address,String department,double basicpay){
        super(id, name, address, department, basicpay);
    }
    @Override 

    double calculate_Salary(){
        return basicpay+(basicpay*0.25);
    }
    
}
