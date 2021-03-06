package collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 数组转换为集合
 * 数组的工具类:Arrays提供了一个静态方法asList,可以将当前数组转换为一个List集合
 */
public class ArrayToListDemo {
    public static void main(String[] args) {
        String[] array = {"one","two","three","four","five"};
        List<String> list = Arrays.asList(array);
        System.out.println("array:"+Arrays.toString(array));
        System.out.println("list:"+list);
        //将集合第二个换成"2"
        list.set(1, "2");
        System.out.println("list:"+list);
        //对集合的操作就是对原数组的操作
        System.out.println("array:"+Arrays.toString(array));
        /*
        由于数组是定长的,因此该数组转换出来的集合是不能被增删元素操作的,
        否则会抛出异常:java.lang.UnsupportedOperationException
         */
//        list.add("six");
        //如果希望对集合做增删操作,则需要自行创建一个新集合
//        List<String> list2 = new ArrayList<>();
//        list2.addAll(list);
        /*
            所有的集合都支持一个
         */
        List<String> list2 = new ArrayList<>(list);
        System.out.println("list2:"+list2);
        list2.add("six");
        System.out.println("list2:"+list2);

    }
}
