public class Person<T> {
    protected T name;
    protected T lastname;
    protected int tickets;

    public Person(T name, T lastname, int tickets) {
        this.name = name;
        this.lastname = lastname;
        this.tickets = tickets;
    }
}
