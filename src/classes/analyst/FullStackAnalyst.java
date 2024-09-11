package classes.analyst;

import interfaces.analyst.BusinessAnalyst;
import interfaces.analyst.DataAnalyst;
import interfaces.analyst.SystemAnalyst;

public class FullStackAnalyst implements DataAnalyst, SystemAnalyst, BusinessAnalyst {

    private String collectedData;
    private String systemArchitecture;
    private String systemDocumentation;
    private String businessRequirements;


    @Override
    public void collectData() {
        System.out.println("\nData collected from Database, API, and Survey");
    }

    @Override
    public String createDataReport() {
        if (collectedData == null || collectedData.isEmpty()) {
           System.out.println("\nNo data collected. Please collect data first.");
        }
        return "\nData report based on the collected data: " + collectedData;
    }

    @Override
    public void analyzeSystemRequirements() {
        System.out.println("\nAnalyzing system requirements: High availability, Scalability, Security");
    }

    @Override
    public void designSystemArchitecture() {
        System.out.println( "\nSystem architecture designed with Database Server, Application Server and Load Balancer");
    }

    @Override
    public String createSystemDocumentation() {
        if (systemArchitecture == null || systemArchitecture.isEmpty()) {
            System.out.println("\nSystem architecture not designed. Please design architecture first.");
        }
        return  "\nSystem documentation created with details: " + systemArchitecture;
    }

    @Override
    public void gatherRequirements() {
        System.out.println("\nBusiness requirements gathered: Increase revenue, Improve customer satisfaction");
    }

    @Override
    public String createBusinessModel() {
        if (businessRequirements == null || businessRequirements.isEmpty()) {
            System.out.println("\nBusiness requirements not gathered. Please gather requirements first.");
        }
        return  "\nBusiness model created based on: " + businessRequirements;
    }


    @Override
    public void startShift() {
        System.out.println("\nShift started at " +  java.time.LocalTime.now().format(java.time.format.DateTimeFormatter.ofPattern("HH:mm:ss")));
    }

    @Override
    public void endShift() {
        System.out.println("\nShift ended at " +  java.time.LocalTime.now().format(java.time.format.DateTimeFormatter.ofPattern("HH:mm:ss")));
    }

    @Override
    public String getPosition() {
        return "Full Stack Analyst";
    }
}
