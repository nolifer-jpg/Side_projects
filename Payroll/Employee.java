package oops_implementation;

abstract class Employee {
    String name;

    Employee(String name){
        this.name = name;
    }
    abstract double monthlyPay();

    @Override
    public String toString(){
        return "name= " + name + ", pay= "+ monthlyPay();
    }
}
