package abstractFactory;

public class A2_TraineeMathTeacher extends A1_Teacher {

    public A2_TraineeMathTeacher(String name, String subject){
        this.name=name;
        this.subject=subject;
    }
    @Override
    public void showDetails(){
        System.out.println("Trainee Teacher name and subject is: "+name+","+subject);
    }
}
