abstract class Employee {
    int empID;
    String name;
    String address;
    String department;
    double basicpay;

    Employee(int id,String n,String add,String dn,double bpay){
        empID=id;
        name=n;
        address = add;
        department = dn;
        basicpay = bpay;
    }

    abstract double calculate_Salary();

    void displayDetails(){
        System.out.println("Name :"+name);
        System.out.println("Basic pay"+basicpay);
        System.out.print("salary :"+calculate_Salary());
    }

    
}
