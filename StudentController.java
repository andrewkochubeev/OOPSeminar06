import java.util.List;
/*Произведены замены Student на ExtendedIdStudent, 3-й приинцип SOLID */
public class StudentController implements UserController<ExtendedIdStudent> {
    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final SortingStudentService sortingStudentService = new SortingStudentService(studentGroupService.getStudentGroup()); // добавлено для работы с SortingStudentService(1 принцип SOLID)
    private StudentView studentView = new StudentView();
    public void removeStudentByFIO(String lastName, String secondName, String firstName) {
        studentGroupService.removeStudentByFIO(lastName, secondName, firstName);
    }

    public List<ExtendedIdStudent> getSortedStudentList() {
        return sortingStudentService.getSortedStudentList();
    }

    public List<ExtendedIdStudent> getSortedStudentByFIO() {
        return getSortedStudentByFIO();
    }

    public void sendOnConsole(){
        studentView.send(studentGroupService.getStudentGroup().getStudentsList());
    }

    @Override
    public void create(String firstName, String secondName, String lastName) {
        ExtendedIdStudent student = new ExtendedIdStudent();
        student.setFirstName(firstName);
        student.setSecondName(secondName);
        student.setLastName(lastName);
        studentGroupService.createStudent(student);
    }
}
