import java.lang.ref.WeakReference;

public class MemoryManagement {
    private static class Person {
        public String name;

        public Person(String name) {
            this.name = name;
        }
    }

    private void memoryManagementTest(Person person) {
        Person person1 = person;
        String stringLiteral = "string2";
        String stringLiteral2 = new String("string3");

    }

    public static void main(String[] args) {
        int primitive1 = 10; // only in stack memory
        Person person = new Person("Shreyansh"); // only in heap memory, reference in stack memory
        String stringLiteral = "string"; // only in heap memory -> string pool
        MemoryManagement obj = new MemoryManagement(); // only in heap memory
        obj.memoryManagementTest(person);

        WeakReference<Person> personWeakReference = new WeakReference<>(person); // only in heap memory can be deleted by GC -> weak reference
    }
}
