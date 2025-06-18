package CreationalDP.factory;

public class A2_BackendEmployee extends A1_Employee {

    String backendEmpId;

    public A2_BackendEmployee(String name, String deptName, String empId, String backendEmpId){
        this.name=name;
        this.deptName=deptName;
        this.empId=empId;
        this.backendEmpId=backendEmpId;
    }

    @Override
    public String toString() {
        return "BackendEmployee{" +
                "backendEmpId='" + backendEmpId + '\'' +
                ", name='" + name + '\'' +
                ", deptName='" + deptName + '\'' +
                ", empId='" + empId + '\'' +
                '}';
    }
}
