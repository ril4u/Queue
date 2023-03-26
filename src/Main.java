import java.util.*;

public class Main {

    public static List<Person<String>> generateClient() {
        //формирую список из 5 посетителей аттракционов
        List<Person<String>> visitors = new ArrayList<>();
        visitors.add(new Person<>("Гермиона", "Грейнджер", 8));
        visitors.add(new Person<>("Невилл", "Долгопупс", 3));
        visitors.add(new Person<>("Драко", "Малфой", 5));
        visitors.add(new Person<>("Гарри", "Поттер", 15));
        visitors.add(new Person<>("Рональд", "Уизли", 6));
        return visitors;
    }

    public static void main(String[] args) {
        //формирую очередь из списка посетителей
        Queue<Person<String>> queue = new LinkedList<>();
        List<Person<String>> addVisitors = generateClient();
        for (Person<String> addVisitor : addVisitors) {
            queue.offer(addVisitor);
        }
        //выполняется цикл пока не закончатся посетители с билетами
        while (!queue.isEmpty()) {
            Person<String> visitor = queue.poll();
            System.out.println("Посетитель \"" + visitor.name + " " + visitor.lastname + "\" прокатился на аттракционе");
            visitor.tickets--;
            if (visitor.tickets > 0) {
                queue.offer(visitor);
            }
        }
    }
}