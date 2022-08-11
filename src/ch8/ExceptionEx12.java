package ch8;

public class ExceptionEx12 {

    // method에 throws를 쓰면, 이 method 안에서는 Exception이 발생할 수 있으니, 이를 호출하는 곳에서 알아서 처리하라는 뜻
    // 호출 시 method들의 호출 관계를 알 수 있음
    public static void main(String[] args) throws Exception {
        method1();
    }

    static void method1() throws Exception {
        method2();
    }

    static void method2() throws Exception {
        throw new Exception();
    }
}
