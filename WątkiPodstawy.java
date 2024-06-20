/**
 * Przykład użycia wątków poprzez dziedziczenie z klasy Thread.
 */
public class ThreadExample extends Thread {

    private String threadName;

    public ThreadExample(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        System.out.println("Wątek " + threadName + " rozpoczął działanie.");
        try {
            // Symulacja pracy wątku przez spanie na kilka sekund
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Wątek " + threadName + " przerwany.");
        }
        System.out.println("Wątek " + threadName + " zakończył działanie.");
    }

    public static void main(String[] args) {
        ThreadExample thread1 = new ThreadExample("Wątek 1");
        ThreadExample thread2 = new ThreadExample("Wątek 2");

        thread1.start();
        thread2.start();
    }
}





/**
 * Przykład użycia wątków przez implementację interfejsu Runnable.
 */
public class RunnableExample implements Runnable {

    private String threadName;

    public RunnableExample(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        System.out.println("Wątek " + threadName + " rozpoczął działanie.");
        try {
            // Symulacja pracy wątku przez spanie na kilka sekund
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Wątek " + threadName + " przerwany.");
        }
        System.out.println("Wątek " + threadName + " zakończył działanie.");
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableExample("Wątek 1"));
        Thread thread2 = new Thread(new RunnableExample("Wątek 2"));

        thread1.start();
        thread2.start();
    }
}
