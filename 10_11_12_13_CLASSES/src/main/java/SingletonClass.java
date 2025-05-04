public class SingletonClass {

    static private class Eager {
        private static final Eager dbConnection = new Eager();

        private Eager() {
            System.out.println("Eager Instance created");
        }

        public static Eager getInstance() {
            return dbConnection;
        }
    }

    static private class Lazy {
        private static Lazy dbConnection;

        private Lazy() {
            System.out.println("Lazy Instance created");
        }

        public static Lazy getInstance() {
            if(dbConnection == null) {
                dbConnection = new Lazy();
            }
            return dbConnection;
        }
    }

    static private class Synchronized {
        private static Synchronized dbConnection;

        private Synchronized() {
            System.out.println("Synchronized Instance created");
        }

        synchronized public static Synchronized getInstance() {
            if(dbConnection == null) {
                dbConnection = new Synchronized();
            }
            return dbConnection;
        }
    }

    static private class DoubleCheckLocking {
        private static volatile DoubleCheckLocking dbConnection;

        private DoubleCheckLocking() {
            System.out.println("DoubleCheckLocking Instance created");
        }

        public static DoubleCheckLocking getInstance() {
            if(dbConnection == null) {
                synchronized (DoubleCheckLocking.class) {
                    if(dbConnection == null) {
                        dbConnection = new DoubleCheckLocking();
                    }
                }
            }
            return dbConnection;
        }
    }

    static private class BillPugh{
        private BillPugh() {

        }

        private static class BillPughHelper {
            private static final BillPugh INSTANCE_OBJECT = new BillPugh();
        }

        public static BillPugh getInstance() {
            return BillPughHelper.INSTANCE_OBJECT;
        }
    }

    enum Enum {
        INSTANCE;
    }

    public static void main(String [] args) {
        Eager dbConnection = Eager.getInstance();
        Eager dbConnection1 = Eager.getInstance();

        Lazy connection = Lazy.getInstance();
        Lazy connection1 = Lazy.getInstance();

        Synchronized conn1 = Synchronized.getInstance();
        Synchronized conn2 = Synchronized.getInstance();

        DoubleCheckLocking con1 = DoubleCheckLocking.getInstance();
        DoubleCheckLocking con2 = DoubleCheckLocking.getInstance();
    }
}
