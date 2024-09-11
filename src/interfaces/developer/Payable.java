package interfaces.developer;

public interface Payable extends Employee {
    int calculateSalary();
    void paySalary();
}