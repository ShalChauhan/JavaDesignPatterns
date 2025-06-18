package factory;


public class A4_TesterEmployee extends A1_Employee {
    String testerEmpId;

    public A4_TesterEmployee(String name, String deptName, String empId, String testerEmpId){
        this.name=name;
        this.deptName=deptName;
        this.empId=empId;
        this.testerEmpId=testerEmpId;
    }

    @Override
    public String toString() {
        return "TesterEmployee{" +
                "testerEmpId='" + testerEmpId + '\'' +
                ", name='" + name + '\'' +
                ", deptName='" + deptName + '\'' +
                ", empId='" + empId + '\'' +
                '}';
    }
}
