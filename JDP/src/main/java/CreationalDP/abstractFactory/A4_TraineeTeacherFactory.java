package CreationalDP.abstractFactory;

public class A4_TraineeTeacherFactory {

    public static A1_Teacher getTraineeTeacher(String name, String subject){
        if(subject==null)
            return null;
        if(subject.equalsIgnoreCase("Math"))
            return new A2_TraineeMathTeacher(name,subject);
        if(subject.equalsIgnoreCase("Science"))
            return new A3_TraineeScienceTeacher(name,subject);
        return null;
    }
}
