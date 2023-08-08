/*интерфейс соответствует 4-му приципу SOLID Interface Segregation (Принцип разделения интерфейсов), оставлено без изменений */
public interface UserController<T extends User> {
    public void create(String firstName, String secondName, String lastName);
}
