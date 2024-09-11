package classes.developer;

import interfaces.developer.Payable;

public class TeamLeadDeveloper implements Payable {

    private int allTeamCompletedTasks;
    private int workHours;

    public TeamLeadDeveloper(){
        this.allTeamCompletedTasks = 0;
        this.workHours = 0;
        startShift();
    }

    @Override
    public int calculateSalary() {
        int sal = allTeamCompletedTasks * 5 + workHours * 6;
        System.out.println("Salary: " + sal);
        return sal;
    }

    @Override
    public void paySalary(){
        int salary = calculateSalary();
        System.out.println("You got a salary: " + salary);
        setWorkHours(0);
    }

    @Override
    public void startShift(){
        System.out.println("Start working day " + getPosition() + " Time: " +  java.time.LocalTime.now().format(java.time.format.DateTimeFormatter.ofPattern("HH:mm:ss")));
    }

    @Override
    public void endShift(){
        System.out.println("End working day " + getPosition() + " Time: " +  java.time.LocalTime.now().format(java.time.format.DateTimeFormatter.ofPattern("HH:mm:ss")));
    }

    @Override
    public String getPosition(){
        return "Team Lead Developer";
    }

    public void assignTasks(String taskDescription, EmployeeDeveloper developer) {
        System.out.println("Assigned task: " + taskDescription + " to " + developer.getClass().getSimpleName());
        developer.addTask(taskDescription);
    }

    public void setAllTeamCompletedTasks(int allTeamCompletedTasks) { this.allTeamCompletedTasks = allTeamCompletedTasks; }
    public void setWorkHours(int workHours) { this.workHours = workHours; }
}