package classes.analyst;

public class AdvancedDataAnalyst extends AbstractDataAnalyst {

    @Override
    public void collectData() {
        collectedData = "Sample data collected";
        System.out.println("Data collected: Sample data collected");
    }

    @Override
    public void processData() {
        if (collectedData != null && !collectedData.isEmpty()) {
            System.out.println("Data processed: - Processed");
            return;
        }
        System.out.println("No data to process.");

    }
}