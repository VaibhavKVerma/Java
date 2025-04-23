public class StaticNestedClass {
    static int classVariable = 1;

    static class InnerClass {
        public void print() {
            System.out.println("classVariable: " + classVariable);
        }
    }
}
