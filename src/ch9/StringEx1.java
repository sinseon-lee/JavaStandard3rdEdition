package ch9;

public class StringEx1 {

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        System.out.println("String str1 = \"abc\";");
        System.out.println("String str2 = \"abc\";");

        System.out.println("str1 == str2 ? " + (str1 == str2));        // str1와 str2가 같은 주소를 바라보고 있는지 확인
        System.out.println("str1.equals(str2) ? " +str1.equals(str2)); // str1와 str2가 바라보고 있는 주소 내 값이 같은지 확인

        String str3 = new String("\"abc\"");
        String str4 = new String("\"abc\"");

        System.out.println("String str3 = new String(\"abc\");");
        System.out.println("String str4 = new String(\"abc\");");

        System.out.println("str3 == str4 ? " + (str3 == str4));
        System.out.println("str3.equals(str4) ? " + str3.equals(str4));
    }
}
