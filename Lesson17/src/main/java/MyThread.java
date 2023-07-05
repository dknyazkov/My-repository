public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("Поток "+Thread.currentThread().getName() + " начал работу ");
        try {
            sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Поток "+Thread.currentThread().getName()+ " закончил работу");

    }
}
