package com.employeepayroll;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class EmployeePayRollTest {
	@Test
    public void givenEmployeePayrollDB_WhenRetrieved_ShouldMatchEmployeeCount() {
        EmployeePayRollServices employeePayroll = new EmployeePayRollServices();
        String sql = "select * from employee_payroll";
        List<Employee> employeePayrollDataList = employeePayroll.getData(sql);
        Assert.assertEquals(8, employeePayrollDataList.size());
    }

    @Test
    public void givenUpdatingBasicPay_whenUpdated_Returntrue() {
    	 EmployeePayRollServices employeePayroll = new EmployeePayRollServices();
        double BasicPay = 3000000.0;
        String Name = "Terisa";
        double salaryUpdated = employeePayroll.updateData(Name, BasicPay);
        Assert.assertEquals(BasicPay, salaryUpdated,0.0);
    }
}
