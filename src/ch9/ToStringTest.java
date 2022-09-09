package ch9;

public class ToStringTest {

    public static void main(String[] args) {

        String str = new String("KOREA");
        java.util.Date today = new java.util.Date();

        // String과 Date는 적절한 내용을 return하도록 toString이 override 되어있음
        System.out.println(str);
        System.out.println(str.toString());
        System.out.println(today);
        System.out.println(today.toString());
    }
}
