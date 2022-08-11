package ch8;

public class FinallyTest2 {

    public static void main(String[] args) {

        try {

            startInstall();
            copyFiles();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            deleteTempFiles();  // 중복을 없애고 한 줄로 리팩토링할 수 있게됨
        }
    }

    static void startInstall() {

    }

    static void copyFiles() {

    }

    static void deleteTempFiles() {

    }
}
