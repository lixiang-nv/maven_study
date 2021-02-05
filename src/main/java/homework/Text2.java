package homework;

import java.util.ArrayList;
import java.util.Collection;

public class Text2 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
        for (String s : c) {
            System.out.println(s);
        }
        System.out.println(c);
    }
}
