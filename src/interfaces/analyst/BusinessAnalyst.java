package interfaces.analyst;

import interfaces.developer.Employee;

public interface BusinessAnalyst extends Employee {
    void gatherRequirements();
    String createBusinessModel();
}


