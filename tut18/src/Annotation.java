import java.lang.annotation.Documented;
import java.util.*;

public class Annotation {

    @Deprecated
    static public void deprecated() {
    }

    static class A {
        public boolean test() {
            return true;
        }
    }

    static class B extends A {
        @Override // Used over methods
        public boolean test() {
            return true;
        }
    }

    static void unusedMethod() {

    }

    @Custom(name = "ok")
    static class C {

    }

    static class D extends C {

    }

    // Heap Pollution storing List<String> in List<Integer>
    static void printLogValues(List<Integer>... arr) {
        Object[] objectList = arr;
        List<String> stringList = new ArrayList<>();
        stringList.add("gheo");
        objectList[0] = stringList;
    }

    @SuppressWarnings(value = "all")
    public static void main(String[] args) {
        deprecated();
        System.out.println(new C().getClass().getAnnotation(Custom.class));
        System.out.println(new D().getClass().getAnnotation(Custom.class));
    }
}