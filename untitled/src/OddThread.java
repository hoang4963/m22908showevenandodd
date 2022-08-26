public class OddThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(15);
            }
            catch (Exception e){
                e.fillInStackTrace();
            }
            if (i % 2 == 1){
                System.out.println(i);
            }
        }
    }
}
