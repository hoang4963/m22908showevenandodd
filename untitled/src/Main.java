public class Main {
    public static void main(String[] args) {
        EvenThread even = new EvenThread();
        Thread evenThread = new Thread(even);
        OddThread oddThread = new OddThread();
        oddThread.start();
        try {
            oddThread.join();
        }
        catch (Exception e){
            e.fillInStackTrace();
        }
        evenThread.start();
    }
}
