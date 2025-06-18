package abstractFactory;

public class TeacherAbstractFactory {

    public static A1_Teacher getTeacher(String permanent, String name, String subject){
        if(permanent==null)
            return null;
        if(permanent.equalsIgnoreCase("Y"))
            return A7_PermanentTeacherFactory.getPermanentTeacher(name,subject);
        if(permanent.equalsIgnoreCase("N"))
            return A4_TraineeTeacherFactory.getTraineeTeacher(name,subject);
        return null;
    }
}
