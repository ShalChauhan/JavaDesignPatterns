package abstractFactory;

public class A5_PermanentMathTeacher extends A1_Teacher {

    public A5_PermanentMathTeacher(String name, String subject){
        this.name=name;
        this.subject=subject;
    }
    public void showDetails(){
        System.out.println("Permanent Teacher name and subject is:  "+name+","+subject);
    }
}
