package ch8;

import java.io.*;

public class ExceptionEx15 {

    public static void main(String[] args) {
        // command line에서 입력받은 값을 이름으로 갖는 파일을 생성
        File f = createFile(args[0]);
        System.out.println(f.getName() + " 파일 생성됨");
    }

    static File createFile(String fileName) {

        try {
            if (fileName == null || fileName.equals(""))
                throw new Exception("파일 이름이 유효하지 않습니다.");
        } catch (Exception e) {
            fileName = "제목없음.txt";
        } finally {
            File f = new File(fileName);
            createNewFile(f);
            return f;
        }
    }

    static void createNewFile(File f) {
        try {
            f.createNewFile();
        } catch (Exception e) {

        }
    }
}
