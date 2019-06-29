package thread.thread;

/**
 * Created by gengtao on 2019/6/11.
 */
public class Demo1 {
    //继承thread
    public static Runnable th = () ->System.out.println("I am  child 1");

    public static class MyThread extends Thread{
        @Override
        public void run(){
            System.out.println("I am child 2");
        }
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        th.run();
    }
}
