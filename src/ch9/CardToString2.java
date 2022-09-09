package ch9;

class Card2 {
    String kind;
    int number;

    Card2() {
        this("SPACE", 1);
    }

    Card2(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    // toString 재정의
    // Object의 toString도 public이기 때문에, 여기서도 public을 붙여줌
    public String toStrings() {
        return "kind : " + kind + ", number : " + number;
    }
}
public class CardToString2 {

    public static void main(String[] args) {

        Card2 c1 = new Card2();
        Card2 c2 = new Card2("HEART", 10);
        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
