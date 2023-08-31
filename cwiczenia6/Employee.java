import java.util.Calendar;

public class Employee extends Person{
    int hireDate;
    String companyName;
    double salary;

    public Employee(String firstName, String lastName, int birthdayYear, int hireDate, String companyName, double salary) {
        super(firstName, lastName, birthdayYear);
        this.hireDate = hireDate;
        this.companyName = companyName;
        this.salary = salary;
    }

    public int getJobSeniority(){
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return currentYear-hireDate;
    }
    public double getSalary(){
        return salary;
    }

}
