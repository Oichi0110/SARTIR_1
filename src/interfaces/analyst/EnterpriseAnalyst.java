package interfaces.analyst;

public interface EnterpriseAnalyst extends SystemAnalyst, BusinessAnalyst {
    void performRiskAnalysis();
    String createStrategicPlan();
}