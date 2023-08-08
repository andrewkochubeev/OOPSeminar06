import java.util.Iterator;
import java.util.List;
/*Произведены замены Student на ExtendedIdStudent, 3-й приинцип SOLID */
public class StudentGroup implements Iterable<ExtendedIdStudent> {
    private List<ExtendedIdStudent> studentsList;

    public List<ExtendedIdStudent> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(List<ExtendedIdStudent> studentsList) {
        this.studentsList = studentsList;
    }

    public void createStudent(ExtendedIdStudent student){
        studentsList.add(student);
    }

    @Override
    public Iterator<ExtendedIdStudent> iterator() {
        return new StudentGroupIterator(this);
    }
}
