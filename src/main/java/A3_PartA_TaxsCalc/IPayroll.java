package A3_PartA_TaxsCalc;

public interface IPayroll {

    double computeTax(double income);
    double weeklySalary(Employee income);
    double fortnightSalary(Employee income);
    double computeKiwiSaver(Employee income);

}
