public class Enum {

    enum NormalEnum {
        MON,
        TUE,
        WED,
        THURS,
        FRI,
        SAT,
        SUN
    }

    enum CustomEnum {
        MON("MON","1st day") {
            @Override
            public void method() {
                System.out.println("MONDAY METHOD");
            }
        },
        TUE("TUE","2nd day"),
        WED("WED","3rd day"),
        THURS("THURS","4th day"),
        FRI("FRI","5th day");

        private final String val;
        private final String description;

        CustomEnum(String val, String description) {
            this.val = val;
            this.description = description;
        }

        public String getVal() {
            return this.val;
        }

        public String getDescription() {
            return this.description;
        }

        public void method() {
            System.out.println("DEFAULT METHOD");
        }
    }

    interface MyInterface {
        String toLowerCase();
    }

    enum InterfaceEnum implements MyInterface {
        MON,
        TUE,
        WED,
        THURS,
        FRI,
        SAT,
        SUN;


        @Override
        public String toLowerCase() {
            return this.name().toLowerCase();
        }
    }

    public static void main(String [] args) {
        /*Common functions:
            - values()
            - ordinal()
            - valueOf()
            - name()
         */

        for (NormalEnum sample: NormalEnum.values()) {
            System.out.println(sample.ordinal());
        }

        NormalEnum enumValue = NormalEnum.valueOf("FRI");
        System.out.println(NormalEnum.FRI.name());
    }
}
