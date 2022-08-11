package ch8;

public class ExceptionEx1 {

    public static void main(String[] args) {

        try {
            try {

            } catch (Exception e) {

            }
        } catch (Exception e) {
            try {

            } catch (Exception e2) { // line 13의 (Exception e)와 변수를 다르게 사용해야 한다.

            }
        }

        try {

        } catch (Exception e) {

        }
    }
}
