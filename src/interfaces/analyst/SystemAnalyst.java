package interfaces.analyst;

import interfaces.developer.Employee;

public interface SystemAnalyst extends Employee {
    void analyzeSystemRequirements();
    void designSystemArchitecture();
    String createSystemDocumentation();
}