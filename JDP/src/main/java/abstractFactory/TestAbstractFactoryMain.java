package abstractFactory;

public class TestAbstractFactoryMain {
    public static void main(String ar[]){
        A1_Teacher mathTeacher= TeacherAbstractFactory.getTeacher("Y","Shushil","Math");
        mathTeacher.showDetails();
        A1_Teacher scienceTeacher= TeacherAbstractFactory.getTeacher("N","Smita","Science");
        scienceTeacher.showDetails();
    }
}
