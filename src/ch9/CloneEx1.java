package ch9;

// clone을 사용하려면, Cloneable interface를 구현하고, clone()을 public으로 오버라이딩 해야함.
// Object 내 clone()은 protected이기 때문
class Point implements Cloneable {

    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "x=" + x + ", y=" + y;
    }

    public Point clone() {
        Object obj = null;
        try {
            obj = super.clone(); // clone은 반드시 예외처리를 해줘야 한다.
        } catch (CloneNotSupportedException e) { }

        return (Point) obj;
    }

}

public class CloneEx1 {

    public static void main(String[] args) {
        Point original = new Point(3, 5);
        Point copy = (Point) original.clone();
        System.out.println(original);
        System.out.println(copy);
    }
}
