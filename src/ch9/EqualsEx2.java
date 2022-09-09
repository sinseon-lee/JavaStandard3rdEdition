package ch9;

class Person {
    long id;

    public Person(long id) {
        this.id = id;
    }

    public boolean equals(Object obj) {
        if(obj instanceof Person)
            return id == ((Person) obj).id;
        else
            return false;
    }
}

public class EqualsEx2 {

    public static void main(String[] args) {
        Person p1 = new Person(8011081111222L);
        Person p2 = new Person(8011081111222L);

        // 주소값이 다름
        if (p1 == p2)
            System.out.println("p1과 p2는 같은 사람입니다.");
        else
            System.out.println("p1과 p2는 다른 사람입니다.");

        // equals를 새로 정의해서 내용을 비교하도록 함
        if (p1.equals(p2))
            System.out.println("p1과 p2는 같은 사람입니다.");
        else
            System.out.println("p1과 p2는 다른 사람입니다.");
    }
}
