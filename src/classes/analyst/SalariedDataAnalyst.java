package classes.analyst;

import interfaces.analyst.DataAnalyst;
import interfaces.developer.Payable;

public class SalariedDataAnalyst implements DataAnalyst, Payable {

    private int hoursWorked;
    private String collectedData;


    public SalariedDataAnalyst() {
        this.hoursWorked = 0;
        startShift();
    }

    @Override
    public void startShift() {
        System.out.println("Shift started at " + java.time.LocalTime.now().format(java.time.format.DateTimeFormatter.ofPattern("HH:mm:ss")));
    }

    @Override
    public void endShift() {
        System.out.println("Shift ended at " + java.time.LocalTime.now().format(java.time.format.DateTimeFormatter.ofPattern("HH:mm:ss")));
    }

    @Override
    public String getPosition() {
        return "Salaried Data Analyst";
    }

    @Override
    public void collectData() {
        System.out.println("Data collected from various sources, including databases and APIs.");
    }

    @Override
    public String createDataReport() {
        if (collectedData == null || collectedData.isEmpty()) {
            return "\nNo data collected. Please collect data first.";
        }
        return "\nData report based on the collected data: " + collectedData;
    }

    @Override
    public int calculateSalary() {
        int salary = hoursWorked * 7;
        System.out.println("Calculated salary: $" + salary);
        return salary;
    }

    @Override
    public void paySalary() {
        int salary = calculateSalary();
        System.out.println("\nSalary of $" + salary + " has been paid to " + getPosition());
        hoursWorked = 0;
    }
}