import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericClass {
    public static class Print<T> {
        T value;

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }
    }

    public static class ColorPrint extends Print<String> {}

    public static class AnyPrint<T> extends Print<T> {}

    public static class KeyValue<K, V> {
        K key;
        V value;

        public KeyValue(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }

    public static class GenericMethod {
        public <K,V> void printKeyValue(KeyValue<K, V> keyValue) {
            System.out.println(keyValue.getKey());
            System.out.println(keyValue.getValue());
        }
    }

    // Upper Bound
    public static class UpperBound<T extends Number, U extends List> { // Can pass Number and its child classes(Integer, Double, BigDecimal)
        T value;
        U list;
    }

    // Multi Bound
    public static class MultiBound<T extends Number & List> { // The first extend can be class or interface and rest will be interfaces
        T value;
    }

    public static void main(String []args) {
        Print<String> print = new Print<>();
        print.setValue("Hello");
        System.out.println(print.getValue());

        Print<Integer> print1 = new Print<>();
        print1.setValue(10);
        System.out.println(print1.getValue());

        ColorPrint colorPrint = new ColorPrint();
        colorPrint.setValue("Hello");
        System.out.println(colorPrint.getValue());

        AnyPrint<String> anyPrint = new AnyPrint<>();
        anyPrint.setValue("Hello");
        System.out.println(anyPrint.getValue());

        KeyValue<String, Integer> keyValue = new KeyValue<>("Hello", 10);
        System.out.println(keyValue.getKey());
        System.out.println(keyValue.getValue());

        // RAW TYPE -> Object is type
        AnyPrint object = new AnyPrint<>();
        object.setValue("Hello");
        System.out.println(object.getValue());

        UpperBound<Integer, ArrayList> upperBound = new UpperBound<>();
//        UpperBound<Integer, HashMap> upperBound = new UpperBound<>(); // Error
    }
}
