package ch8;

public class ExceptionEx7 {

    public static void main(String args[]) {

        System.out.println(1);
        System.out.println(2);

        try {
            System.out.println(3);
            System.out.println(0/0); //Exception 발생
            System.out.println(4);  // 실행되지 않음
        } catch (ArithmeticException ae) { // line 12에서 발생한 Exception은 첫 번째 catch 블록에서 일치했기 때문에, 두 번째 catch 블록은 검사하지 않는다.
            if (ae instanceof ArithmeticException)
                System.out.println("it's ArithmeticException.");
            System.out.println("ArithmeticException");
        } catch (Exception e) {
            System.out.println("Exception");
        }

        System.out.println(6);
    }
}
