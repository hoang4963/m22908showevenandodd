public class EvenThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                e.fillInStackTrace();
            }
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
