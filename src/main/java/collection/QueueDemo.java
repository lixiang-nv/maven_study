package collection;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 队列
 * 队列可以保户一组元素,但是存
 */
public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        //offer:入队操作,将元素添加到队列末尾
        queue.offer("one");
        queue.offer("two");
        queue.offer("three");
        queue.offer("four");
        queue.offer("five");
        System.out.println(queue);

        //poll:出队操作
        String str = queue.poll();
        System.out.println(str);
        System.out.println(queue);

        //peek:引用队首元素
        str = queue.peek();
        System.out.println(str);
        System.out.println(queue);

        //遍历可以获取队列每一个元素,并且不影响元素在队列中
        System.out.println("size:"+queue.size());
        for(String s : queue){
            System.out.println(s);
        }
        System.out.println(queue);

        //使用poll方法遍历则一次性的
        while(queue.size()>0){
            str = queue.poll();
            System.out.println(str);
        }
        System.out.println(queue);

    }

}
