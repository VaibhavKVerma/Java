public class Main {

    static class Person {
        Person() {

        }
    }

    public static void main(String []args) {
        Object object = new Person();
        System.out.println(object.getClass());
    }
}
