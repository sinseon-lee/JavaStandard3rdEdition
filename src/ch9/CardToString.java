package ch9;

class Card {
    String kind;
    int number;

    Card() {
        this.kind = kind;
        this.number = number;
    }

    Card(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }
}

public class CardToString {

    public static void main(String[] args) {
        Card2 c1 = new Card2();
        Card2 c2 = new Card2();

        System.out.println(c1.toString()); //16진수로 변환된 hashCode값이 출력된다.
        System.out.println(c2.toString());
    }
}
