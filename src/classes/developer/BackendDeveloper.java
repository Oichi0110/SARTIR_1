package classes.developer;

public class BackendDeveloper extends EmployeeDeveloper {

    public BackendDeveloper(){
        super();
    }

    @Override
    public String getPosition(){
        return "Backend Developer";
    }

    @Override
    public int calculateSalary() {
        int workHours = getWorkHours();
        int completedTasks = getCompletedTasks();
        int sal = workHours * 3 + completedTasks * 7;
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
