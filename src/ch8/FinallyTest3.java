package ch8;

public class FinallyTest3 {

    public static void main(String[] args) {

        method1();
        System.out.println("method1 호출 후 main으로 돌아왔습니다.");
    }

    static void method1() {

        try {
            System.out.println("method1이 호출되었습니다.");
            return; // return 되기 전에 finally 블록이 실행된 후에 return된다. catch 안에 return이 있는 경우도 마찬가지이다.
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("method1의 finally 블록이 실행되었습니다.");
        }
    }
}
