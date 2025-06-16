package oops_implementation;

public class CommissionEmployee extends Employee{
    double baseSalary;
    double commission;

    CommissionEmployee(String name, double baseSalary, double commission) {
        super(name);
        this.baseSalary = baseSalary;
        this.commission = commission;
    }
    //@Override
    double monthlyPay(){
        return baseSalary+commission;
    }
}
