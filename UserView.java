import java.util.List;
/*интерфейс соответствует 4-му приципу SOLID Interface Segregation (Принцип разделения интерфейсов), оставлено без изменений */
public interface UserView<T extends User> {
    //public void sendOnConsole(List<T> listT);
    public void send(List<T> listT);
}
