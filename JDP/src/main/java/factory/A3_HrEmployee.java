package factory;


public class A3_HrEmployee extends A1_Employee {
    String hrEmpId;
    public A3_HrEmployee(String name, String deptName, String empId, String hrEmpId){
        this.name=name;
        this.deptName=deptName;
        this.empId=empId;
        this.hrEmpId=hrEmpId;
    }

    @Override
    public String toString() {
        return "HrEmployee{" +
                "hrEmpId='" + hrEmpId + '\'' +
                ", name='" + name + '\'' +
                ", deptName='" + deptName + '\'' +
                ", empId='" + empId + '\'' +
                '}';
    }
}