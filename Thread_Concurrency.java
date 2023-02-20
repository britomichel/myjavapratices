public class Thread_Concurrency extends Thread {
  
    public static int amount = 0;

  public static void main(String[] args) {
    Thread_Concurrency thread = new Thread_Concurrency();
    thread.start();
    System.out.println("amount (out 1):" + amount);
    amount++;
    System.out.println("amount (out 2):" + amount);
  }

  public void run() {
    amount++;
    System.out.println("amount (in Thread):" + amount);
  }
}
