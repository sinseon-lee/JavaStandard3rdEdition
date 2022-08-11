package ch8;

public class ExceptionEx9 {

    public static void main(String args[]) {

        try {
            Exception e = new Exception("고의로 발생시켰음");
            throw e;
            // throw new Exception("고의로 발생시켰음"); // 위 두 줄은 한 줄로 리팩토링 가능
        } catch (Exception e) {
            System.out.println("message : " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("program end");
    }
}
