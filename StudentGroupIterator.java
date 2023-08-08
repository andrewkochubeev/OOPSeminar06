import java.util.Iterator;
import java.util.List;
/*Произведены замены Student на ExtendedIdStudent, 3-й приинцип SOLID */
public class StudentGroupIterator implements Iterator<ExtendedIdStudent> {
    private int counter;
    private final List<ExtendedIdStudent> studentList;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.studentList = studentGroup.getStudentsList();
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < studentList.size() - 1;
    }

    @Override
    public ExtendedIdStudent next() {
        if (!hasNext()) {
            return null;
        }
        counter++;
        return studentList.get(counter);
    }

    @Override
    public void remove() {
        studentList.remove(counter);
    }
}
