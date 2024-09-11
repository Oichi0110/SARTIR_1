import classes.analyst.FullStackAnalyst;
import classes.developer.BackendDeveloper;
import classes.developer.FrontendDeveloper;
import classes.developer.TeamLeadDeveloper;

import java.io.IOException;

public class Main {
    public static void main(String... args){

        TeamLeadDeveloper lead = new TeamLeadDeveloper();
        FrontendDeveloper front = new FrontendDeveloper();
        BackendDeveloper bac = new BackendDeveloper();

        bac.calculateSalary();
        lead.assignTasks("test task", front);
        System.out.println(front.getTasks());

        bac.endShift();

        FullStackAnalyst analyst = new FullStackAnalyst();

        analyst.startShift();
        analyst.collectData();
        System.out.println(analyst.createDataReport());
        analyst.analyzeSystemRequirements();
        analyst.designSystemArchitecture();
        System.out.println(analyst.createSystemDocumentation());
        analyst.gatherRequirements();
        System.out.println(analyst.createBusinessModel());
        analyst.endShift();
        System.out.println("Position: " + analyst.getPosition());

        System.out.println("IM GAY IM GAY");
    }
}
