package CreationalDP.abstractFactory;

public class A7_PermanentTeacherFactory {

    public static A1_Teacher getPermanentTeacher(String name, String subject){
        if(subject==null)
            return null;
        if(subject.equalsIgnoreCase("Math"))
            return new A5_PermanentMathTeacher(name,subject);
        if(subject.equalsIgnoreCase("Science"))
            return new A6_PermanentScienceTeacher(name,subject);
        return null;
    }
}
