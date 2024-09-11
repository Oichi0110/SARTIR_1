package classes.developer;

public class FrontendDeveloper extends EmployeeDeveloper {

    public FrontendDeveloper(){
        super();
    }

    @Override
    public String getPosition(){
        return "Frontend Developer";
    }

    @Override
    public int calculateSalary() {
        int workHours = getWorkHours();
        int completedTasks = getCompletedTasks();
        int sal = workHours * 3 + completedTasks * 4;
        System.out.println("Salary: " + sal);
        return sal;
    }

    @Override
    public void paySalary(){
        int salary = calculateSalary();
        System.out.println("You got a salary: " + salary);
        setWorkHours(0);
    }
}