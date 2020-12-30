public class Number implements Runnable {
    int n = 0;
    public Number(int n) {
        this.n = n;
    }
    public void run() {
        System.out.println("Starting printing multiples of " + n);
        for (int i = 1; i <= 5; i++) {
            System.out.println(i * n);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Finished printing multiples of " + n);
    }
    public static void main(String[] args) {
        System.out.println("Main running");
        Thread two = new Thread(new Number(2));
        Thread five = new Thread(new Number(5));
        Thread eight = new Thread(new Number(8));
        two.start();
        five.start();
        eight.start();
        try {
            two.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Finished main");
    }
}