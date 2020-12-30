public class DemoThread1 implements Runnable {
    public DemoThread1() {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {

                for (int i = 1; i <= 10; i++) {
                    System.out.println(i + "\n");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t.start();
    }

    @Override
    public void run() {
        System.out.println("Running Child Thread in Loop: \n");
    }
}
