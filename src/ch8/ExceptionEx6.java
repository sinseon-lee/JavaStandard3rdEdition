package ch8;

public class ExceptionEx6 {

    public static void main(String args[]) {

        System.out.println(1);
        System.out.println(2);

        try {
            System.out.println(3);
            System.out.println(0/0); // Exception 발생. 실행되지 않음
            System.out.println(4);   // 실행되지 않음
        } catch (Exception e) {      // Exception은 모든 Exception들의 조상이므로, 다형성에 의해 모든 Exception에 대한 처리 가능
            System.out.println(5);
        }

        System.out.println(6);
    }
}
