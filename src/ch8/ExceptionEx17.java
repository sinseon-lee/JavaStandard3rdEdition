package ch8;

public class ExceptionEx17 {

    public static void main(String[] args) {
        // 호출한 method에서도 Exception을 처리하고,
        try {
            method1();
        } catch (Exception e) {
            System.out.println("main에서 예외가 처리되었습니다.");
        }
    }

    static void method1() throws Exception {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("method1에서 예외가 처리되었습니다.");
            throw e; // 호출된 method 내에서 Exception 처리를 한 후 고의로 Exception을 발생시켜, 호출한 method에서도 Exception을 처리하도록 한다.
        }
    }
}
