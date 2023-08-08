import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*Перенесено из StudentGroupService, принцип Single Responsibility (Принцип единственной ответственности) */
/*Произведены замены Student на ExtendedIdStudent, 3-й приинцип SOLID */
public class SortingStudentService {
    private StudentGroup studentGroup;
    public SortingStudentService(StudentGroup studentGroup){
        this.studentGroup = studentGroup;
    }
    public List<ExtendedIdStudent> getSortedStudentList() {
        List<ExtendedIdStudent> studentList = new ArrayList<>(studentGroup.getStudentsList());
        Collections.sort(studentList);
        return studentList;
    }

    public List<ExtendedIdStudent> getSortedStudentByFIO() {
        List<ExtendedIdStudent> studentList = new ArrayList<>(studentGroup.getStudentsList());
        studentList.sort(new UserComparator<ExtendedIdStudent>());
        return studentList;
    }
}
