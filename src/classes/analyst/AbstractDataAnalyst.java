package classes.analyst;

import interfaces.analyst.DataAnalyst;

public abstract class AbstractDataAnalyst implements DataAnalyst {

    protected String collectedData;

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
        return "Data Analyst";
    }

    @Override
    public abstract void collectData();

    @Override
    public String createDataReport() {
        if (collectedData == null || collectedData.isEmpty()) {
            return "\nNo data collected. Please collect data first.";
        }
        return  "\nData report based on the collected data: " + collectedData;
    }

    public abstract void processData();
}