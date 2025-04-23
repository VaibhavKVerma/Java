import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Both are same
        char c = 65;
        System.out.println(c);
        char c1 = 'A';
        System.out.println(c1);

        byte b = 127;
        System.out.println(b);
        byte b1 = (byte)129;
        System.out.println(b1);


        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));

        int num = (int)(Math.random() * 10);
        System.out.println(num);

        ArrayList<Integer> li = new ArrayList<>();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
    }
}
