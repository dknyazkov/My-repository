public class Main {
    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new MyThread();
        Thread thread2 = new MyThread();
        Thread thread3 = new MyThread();
        thread1.setName("T1");
        thread2.setName("T2");
        thread3.setName("T3");

        thread3.start();
        thread3.join();
        thread2.start();
        thread2.join();
        thread1.start();
    }
}