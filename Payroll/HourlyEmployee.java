package oops_implementation;

public class HourlyEmployee extends Employee{
    double hourlyRate;
    int hoursWorked;

    HourlyEmployee(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    //@Override
    double monthlyPay(){
        return hourlyRate * hoursWorked;
    }
}
