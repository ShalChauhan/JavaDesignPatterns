package CreationalDP.factory;

public class TestFactoryMain {

    public static void main(String ar[]){
       A1_Employee emp= EmployeeFactory.getEmployee("BE","Shalini","Payments","7816779","Lloyds");
       System.out.println("Object fetched from Factory: " + emp.toString());
    }
}
