package abstractFactory;

public class A6_PermanentScienceTeacher extends A1_Teacher {

    public A6_PermanentScienceTeacher(String name, String subject){
        this.name=name;
        this.subject=subject;
    }
    public void showDetails(){
        System.out.println("Permanent Teacher name and subject is:  "+name+","+subject);
    }
}
