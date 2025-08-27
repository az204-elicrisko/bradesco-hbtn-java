import java.util.Random;

public class Produtor extends Thread {
    private Fila buffer;
    private Random random = new Random();


    public Produtor(Fila buffer) {
        this.buffer = buffer;
    }


    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                int numero = random.nextInt(101); // número aleatório de 0 a 100
                buffer.adicionar(numero);  // O produtor coloca os itens no buffer
                Thread.sleep(1000);   // Simula o tempo para produzir um item
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
