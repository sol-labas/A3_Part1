package A3_PartA_TaxsCalc;

public class Employee {

    private double annualSalary;
    private int kiwiSaver;

    public Employee(double annualSalary, int kiwiSaver) {
        this.annualSalary = annualSalary;
        this.kiwiSaver = kiwiSaver;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public int getKiwiSaver() {
        return kiwiSaver;
    }

    public void setKiwiSaver(int kiwiSaver) {
        this.kiwiSaver = kiwiSaver;
    }
}
