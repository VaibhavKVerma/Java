public class PrivateInnerClass {
    static int classVariable = 1;
    private static class PrivateInnerClas {
        public void print() {
            System.out.println("classVariable: " + classVariable);
        }
    }

    public void display() {
        new PrivateInnerClas().print();
    }
}
