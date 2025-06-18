package CreationalDP.abstractFactory;

public class A3_TraineeScienceTeacher extends A1_Teacher {

    public A3_TraineeScienceTeacher(String name, String subject){
        this.name=name;
        this.subject=subject;
    }
    public void showDetails(){
        System.out.println("Trainee Teacher name and subject is:  "+name+","+subject);
    }
}
