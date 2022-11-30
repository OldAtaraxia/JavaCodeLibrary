package concurrent;

import example.innerclasses.DotNew;

import java.util.Random;
import java.util.concurrent.Callable;

public class CreateThread {

    class RunnableThread implements Runnable {

        @Override
        public void run() {
            System.out.println("实现Runnable接口来实现线程");
        }
    }

    class ExtendsThread extends Thread {
        @Override
        public void run() {
            System.out.println("用Thread类实现线程");
        }
    }

    class CallableTask implements Callable<Integer> {

        @Override
        public Integer call() throws Exception {
            return new Random().nextInt();
        }
    }

    public void test() {
        new Thread(new RunnableThread()).start();
        new ExtendsThread().start();
    }

    public static void main(String[] args) {
        new CreateThread().test();

    }

}
