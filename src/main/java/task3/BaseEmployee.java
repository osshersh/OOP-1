package task3;

public class BaseEmployee {
    public String firstname;
    public String lastName;
    public final double salary;
    public final int yearEmployment;

    public BaseEmployee(double salary, int yearEmployment) {
        this.salary = salary;
        this.yearEmployment = yearEmployment;
    }

    public double calculateMonthlySalary(){
        return salary;
    }

    public int getExperienceYear(){
        return yearEmployment;
    }

    public double getSalary() {
        return salary;
    }
}
