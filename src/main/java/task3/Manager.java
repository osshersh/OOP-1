package task3;

public class Manager extends BaseEmployee {
    private double bonus;

    public Manager(int yearEmployment, double salary) {
        super(salary, yearEmployment);
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calculateMonthlySalary() {
        return getSalary();
    }

    @Override
    public int getExperienceYear() {
        short presentYear = 2022;
        return presentYear - yearEmployment;
    }

    public double calculateMonthlySalaryWithBonus() {
        return salary + this.bonus;
    }
}
