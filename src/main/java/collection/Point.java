package collection;
import java.util.Objects;
/**
 * 使用当前类实例作为集合元素测试集合相关操作
 */
public class Point {
    private int y;
    private int x;

    public Point(int y, int x) {
        this.y = y;
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "Point{" +
                "y=" + y +
                ", x=" + x +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return y == point.y &&
                x == point.x;
    }

    @Override
    public int hashCode() {
        return Objects.hash(y, x);
    }

    
}
