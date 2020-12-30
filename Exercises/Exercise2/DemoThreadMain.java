public class DemoThreadMain {
    public static void main(String[] args) {
        DemoThread1 dt1 = new DemoThread1();
        dt1.run();
        DemoThread1 dt2 = new DemoThread1();
        dt2.run();
        DemoThread1 dt3 = new DemoThread1();
        dt3.run();
    }
}
