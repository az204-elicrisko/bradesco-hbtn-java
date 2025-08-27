 public class Consumidor extends Thread {
    private Fila buffer;


    public Consumidor(Fila buffer) {
        this.buffer = buffer;
    }


    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                buffer.retirar();  // O consumidor retira os itens do buffer
                Thread.sleep(500);  // Simula o tempo para consumir um item
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
