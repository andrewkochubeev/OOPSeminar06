import java.util.List;
/* добавлен класс для возможности выбора между типом вывода, 5-й принцип Dependency Inversion (Принцип инверсии зависимостей) */
public class Viewer {
    UserView<ExtendedIdStudent> view;

    public void setView(UserView<ExtendedIdStudent> view) {
        this.view = view;
    }
    public Viewer(UserView<ExtendedIdStudent> view){
        this.view = view;
    }
    public void sendList(List<ExtendedIdStudent> listStudent){
        view.send(listStudent);
    }
}
