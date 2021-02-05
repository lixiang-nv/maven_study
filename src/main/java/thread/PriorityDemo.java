package thread;

public class PriorityDemo {
    public static void main(String[] args) {
        Thread norm = new Thread(){
            public void run(){
                for(int i=0;i<1000;i++){
                    System.out.println("norm");
                }
            }
        };
        Thread min = new Thread(){
            public void run(){
                for(int i=0;i<1000;i++){
                    System.out.println("min");
                }
            }
        };
        Thread max = new Thread(){
            public void run(){
                for(int i=0;i<1000;i++){
                    System.out.println("max");
                }
            }
        };
        min.setPriority(Thread.MIN_PRIORITY);
        max.setPriority(Thread.MAX_PRIORITY);

        min.start();
        max.start();
        norm.start();
    }
}
