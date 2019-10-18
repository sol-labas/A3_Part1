package A3_PartA_TaxsCalc;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

/**
 * Unit test for simple App.
 */
public class PayrolImplTest
{

    PayrolImpl payrollImplObj;
    double income, expectedTax, expectedKiwiSaver, expectedFortnightSalary, expectedWeeklySalary;
    double actualTax, actualKiwiSaver, actualFortnightSalary, actualWeeklySalary;
    Employee incomeEmp;


    @Before
    public void setUp() throws Exception {
        payrollImplObj = new PayrolImpl();
        incomeEmp = new Employee(120000.00, 8);
        income = 120000.00;
        expectedTax = 30520.00;
        expectedKiwiSaver = 9600.00;
        expectedFortnightSalary = 3008.15;
        expectedWeeklySalary = 1504.07;

        IPayroll mockObj = Mockito.mock(IPayroll.class);
        Mockito.when(mockObj.computeTax(income)).thenReturn(30520.00);
        Mockito.when(mockObj.computeKiwiSaver(incomeEmp)).thenReturn(9600.00);
        Mockito.when(mockObj.fortnightSalary(incomeEmp)).thenReturn(3008.15);
        Mockito.when(mockObj.weeklySalary(incomeEmp)).thenReturn(1504.07);
        payrollImplObj.setObj(mockObj);

        actualTax = payrollImplObj.computeTax(income);
        actualKiwiSaver = payrollImplObj.computeKiwiSaver(incomeEmp);
        actualFortnightSalary = payrollImplObj.fortnightSalary(incomeEmp);
        actualWeeklySalary = payrollImplObj.weeklySalary(incomeEmp);
    }

    @Test
    public void testComputeTax()
    {
        assertEquals(expectedTax, actualTax, 0.000001);
    }

    @Test
    public void testComputeKiwiSaver()
    {
        assertEquals(expectedKiwiSaver, actualKiwiSaver, 0.000001);
    }

    @Test
    public void testFortnightSalary()
    {
        assertEquals(expectedFortnightSalary, actualFortnightSalary, 0.000001);
    }

    @Test
    public void testWeeklySalary()
    {
        assertEquals(expectedWeeklySalary, actualWeeklySalary, 0.000001);
    }


    @After
    public void tearDown() throws Exception {
        payrollImplObj = null;
    }

}
