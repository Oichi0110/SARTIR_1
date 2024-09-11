package classes.developer;

import interfaces.developer.Payable;
import java.util.List;
import java.util.ArrayList;

public abstract class EmployeeDeveloper implements Payable {

    private List<String> tasks;
    private int completedTasks;
    private int workHours;

    public EmployeeDeveloper(){
        this.workHours = 0;
        this.completedTasks = 0;
        tasks = new ArrayList<>();
        startShift();
    }

    public abstract String getPosition();
    public abstract int calculateSalary();
    public abstract void paySalary();

    public int getCompletedTasks() { return this.completedTasks; }
    public int getWorkHours() { return this.workHours; }

    public void setCompletedTasks(int completedTasks) { this.completedTasks = completedTasks; }
    public void setWorkHours(int workHours) { this.workHours = workHours; }

    protected void addTask(String task) {
        this.tasks.add(task);
    }

    public String getTasks() {
        System.out.println("You tasks: ");
        return String.join(" ", tasks);
    }


    public void startShift(){
        System.out.println("Start working day " + getPosition() + " Time: " +  java.time.LocalTime.now().format(java.time.format.DateTimeFormatter.ofPattern("HH:mm:ss")));
    }


    public void endShift(){
        System.out.println("End working day " + getPosition() + " Time: " +  java.time.LocalTime.now().format(java.time.format.DateTimeFormatter.ofPattern("HH:mm:ss")));
    }
}