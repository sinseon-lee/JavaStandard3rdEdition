package ch9;

final class Card {
    String kind;
    int num;

    Card() {
        this("SPADE", 1);
    }

    Card(String kind, int num) {
        this.kind = kind;
        this.num = num;
    }

    public String toString() {
        return kind + ":" + num;
    }

}

public class ClassEx1 {

    public static void main(String[] args) throws Exception {

        Card c  = new Card("HEART", 3); // new 연산자로 객체 생성
        Card c2 = Card.class.newInstance();          // Class 객체를 통해서 객체 생성

        Class cObject = c.getClass();

        System.out.println(c);
        System.out.println(c2);
        System.out.println(cObject.getName());
        System.out.println(cObject.toGenericString());
        System.out.println(cObject.toString());
    }
}
