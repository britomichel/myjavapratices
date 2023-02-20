public class ThreadAndRun extends Thread {
    
    public static void main(String[] args) {
        ThreadAndRun myThread = new ThreadAndRun();
        myThread.start();
        System.out.println("Essa parte ainda roda FORA da Thread.");
    }

    public void run() {
        System.out.println("Essa parte já roda DENTRO da Thread.");
    }
}
