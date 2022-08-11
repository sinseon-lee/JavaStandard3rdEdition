package ch8;

public class ExceptionEx8 {

    public static void main(String args[]) {

        System.out.println(1);
        System.out.println(2);

        try {
            System.out.println(3);
            System.out.println(0/0); // Exception 발생
            System.out.println(4);   // 실행되지 않음
        } catch (ArithmeticException ae) {
            ae.printStackTrace();    // IntelliJ에서 실행 시, 이 line 결과가 가장 마지막에 나오는데, 이는 IDE에서 System.out.println과 System.err.println의 buffer를 따로 쓰기 때문이다.
            System.out.println("message : " + ae.getMessage());
        }

        System.out.println(6);
    }
}
