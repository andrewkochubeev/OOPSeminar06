import java.util.List;
/*Произведены замены Student на ExtendedIdStudent, 3-й приинцип SOLID */
public class StudentView implements UserView<ExtendedIdStudent> {

    @Override
    public void send(List<ExtendedIdStudent> studentList) {
        System.out.println("Список студентов по id: ");
        for (Student student : studentList) {
            System.out.println(student.getStudentId());
        }
    }
    
}
