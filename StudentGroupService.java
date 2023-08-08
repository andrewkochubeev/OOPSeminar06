import java.util.Iterator;
/*Произведены замены Student на ExtendedIdStudent, 3-й приинцип SOLID */
public class StudentGroupService {

    private StudentGroup studentGroup;

    public StudentGroup getStudentGroup() {
        return studentGroup;
    }

    public void createStudent(ExtendedIdStudent student) {
        studentGroup.createStudent(student);
    }

    public void removeStudentByFIO(String lastName, String secondName, String firstName) {
        Iterator<ExtendedIdStudent> iterator = studentGroup.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getFirstName().equals(firstName) && student.getSecondName().equals(secondName) &&
                    student.getLastName().equals(lastName)) {
                iterator.remove();
            }
        }
    }

    
}
