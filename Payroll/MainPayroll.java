package oops_implementation;

public class MainPayroll {
    public static void main(String[] args){
        SalariedEmployee se = new SalariedEmployee("Aria", 840000);
        HourlyEmployee he = new HourlyEmployee("Ben", 300, 160);
        CommissionEmployee ce = new CommissionEmployee("Chloe",25000, 18000);

        Employee[] workers = {se, he, ce};
        double total = 0;
        for(Employee x: workers){
            System.out.println(x);
            total +=x.monthlyPay();
        }
        System.out.println("Total payroll = $" + total);
    }
}
