package ch8;

public class ExceptionEx2 {
    public static void main(String args[]) {

        int number = 100;
        int result = 0;

        for (int i = 0; i < 10; i++) {
            result = number / (int)(Math.random() * 10); // 0으로 나누려고 할 것이기 때문에 ArithmeticException 발생
            System.out.println(result);
        }
    }
}
