/**
 * 2 принцип SOLID Open-Closed (Принцип открытости-закрытости)
 * совместно с 3-м принципом Liskov Substitution (Принцип подстановки Барбары Лисков)
 */
public class ExtendedIdStudent extends Student {

    @Override
    public void setStudentId(int studentId) {
        beforeSetProcess();
        super.setStudentId(studentId);
        sendSuccessMsg();
    }
    void beforeSetProcess(){

    }
    void sendSuccessMsg(){
        System.out.println("StudentID успешно изменен");
    }
    
}
