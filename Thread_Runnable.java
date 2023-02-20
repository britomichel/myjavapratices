public class Thread_Runnable implements Runnable {
    
    public static void main(String[] args) {
        
        Thread_Runnable myObj = new Thread_Runnable();
        Thread myThread = new Thread(myObj);
        myThread.start();

        System.out.println("Essa parte ainda roda FORA da Thread (Runnable).");
    }

    public void run() {
        System.out.println("Essa parte já roda DENTRO da Thread (Runnable).");
    }
}
