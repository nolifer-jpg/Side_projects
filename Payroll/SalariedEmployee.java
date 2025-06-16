package oops_implementation;

public class SalariedEmployee extends Employee{
    double annualSalary;

    SalariedEmployee(String name, double annualSalary) {
        super(name);
        this.annualSalary = annualSalary;
    }
   //@Override
    double monthlyPay(){
        return annualSalary/12;
    }
}
