package ch8;

public class ExceptionEx14 {

    public static void main(String[] args) {

        try {
            method1();
        } catch (Exception e) {
            System.out.println("main에서 예외 처리됨");
            e.printStackTrace();
        }
    }

    static void method1() throws Exception { // throws를 적어줬기 때문에, method1을 호출하는 main에서 try-catch 처리 해줌

        throw new Exception();
    }
}
