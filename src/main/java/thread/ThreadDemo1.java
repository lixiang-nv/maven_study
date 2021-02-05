package thread;

/**
 * 多线程
 * 多线程可以让多个代码片段并发执行,造成一种"同时"运行的现象.
 * <p>
 * 线程有两种创建方式
 * 方式1:继承Tread并重写run方法
 */
public class ThreadDemo1 {
    public static void main(String[] args) {
        Thread t1 = new MyThread1();
        Thread t2 = new MyThread2();

        t1.start();
        t2.start();
    }
}

class MyThread1 extends Thread {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("你是谁啊?");
        }
    }
}

class MyThread2 extends Thread {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("开门!查水表的!");
        }
    }
}

