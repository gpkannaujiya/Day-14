import java.util.LinkedList;

public class MyLinkedList {
    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();

        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        System.out.println(names);

        names.add(1, "Dave");

        names.removeLast();

        System.out.println(names);
    }
}
