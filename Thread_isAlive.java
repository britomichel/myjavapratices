public class Thread_isAlive extends Thread {

    public static int amount = 0;
    public static void main(String[] args) {
        
        Thread_isAlive t = new Thread_isAlive();
        t.start();

        // aguardar a Thread terminar...
        while( t.isAlive() ) {
            System.out.println("Aguardando...");
        }

        // atualizar amount e exibir valor
        System.out.println("Main 1: amount=" + amount);
        amount++;
        System.out.println("Main 2: amount=" + amount);

    }

    public void run() {
        
        // Processo...
        amount++;
        System.out.println("run(): amount=" + amount);

    }
    
}
