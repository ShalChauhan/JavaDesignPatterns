package factory;

public class EmployeeFactory {

    public static A1_Employee getEmployee(String empType, String empName, String deptName, String empId, String empDeptId){

        if(empType== null)
            return null;
        if(empType.equalsIgnoreCase("HR"))
            return new A3_HrEmployee(empName, deptName, empId, empDeptId);
        if(empType.equalsIgnoreCase("BE"))
            return new A2_BackendEmployee(empName, deptName, empId, empDeptId);
        if(empType.equalsIgnoreCase("Tester"))
            return new A4_TesterEmployee(empName, deptName, empId, empDeptId);
        return null;
    }

}
