package A3_PartA_TaxsCalc;

/**
 * Hello world!
 *
 */
public class PayrolImpl implements IPayroll
{
    IPayroll obj;

    @Override
    public double computeTax(double income) {
        return obj.computeTax(income);
    }

    @Override
    public double weeklySalary(Employee income) {
        return obj.weeklySalary(income);
    }

    @Override
    public double fortnightSalary(Employee income) {
        return obj.fortnightSalary(income);
    }

    @Override
    public double computeKiwiSaver(Employee income) {
        return obj.computeKiwiSaver(income);
    }

    public void setObj(IPayroll obj) {
        this.obj = obj;
    }
}
