package ch9;

public class HashCodeEx1 {

    public static void main(String[] args) {

        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1.equals(str2));
        System.out.println(str1.hashCode());  // String의 hashCode는 문자열 내용으로 Hash값 생성
        System.out.println(str2.hashCode());
        System.out.println(System.identityHashCode(str1));  // System의 identityHashCode는 주소값으로 Hash값 생성
        System.out.println(System.identityHashCode(str2));
    }
}
