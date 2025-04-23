public class AnonymousInnerClass {
    public static abstract class Car {
        public abstract void pressBreak();
    }

    public static void main(String []args) {
        Car car = new Car() {
            public void pressBreak() {
                System.out.println("Break pressed");
            }
        };
        car.pressBreak();
    }

}
