package interfaces.analyst;

import interfaces.developer.Employee;

public interface DataAnalyst extends Employee {
    void collectData();
    String createDataReport();
}
