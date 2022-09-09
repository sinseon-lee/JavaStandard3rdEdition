package ch9;

public class StringEx6 {

    public static void main(String[] args) {

        int iVal = 100;
        String strVal = String.valueOf(iVal); // int를 String으로 변환한다. 뒤에 + ""를 붙이는 방법(아래 방법)보다 성능이 더 좋다

        double dVal = 200.0;
        String strVal2 = dVal + ""; // String으로 변환하는 또 다른 방법. valueOf보다 성능이 낮다.

        double sum  = Integer.parseInt("+"+strVal) + Double.parseDouble(strVal2);
        double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);

        System.out.println(String.join("", strVal, "+", strVal2, "=") + sum);
        System.out.println(strVal + "+" + strVal2 + "=" + sum2);
    }
}
