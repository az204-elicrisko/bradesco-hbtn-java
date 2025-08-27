import java.util.LinkedList;

public class Fila {

    private LinkedList<Integer> buffer = new LinkedList<>();
    private final int capacidade = 10; // Capacidade máxima do buffer


    // Método para o produtor colocar um item no buffer
    public synchronized void adicionar(int item) throws InterruptedException {
        // Se o buffer já tem um item, espera o consumidor consumi-lo
        while (buffer.size() == capacidade) {
            wait(); // Espera o consumidor consumir o item
        }

        // Coloca o item no buffer
        this.buffer.add(item);

        // Notifica o consumidor que o item foi produzido
        notifyAll();
    }


    // Método para o consumidor retirar um item do buffer
    public synchronized int retirar() throws InterruptedException {
        // Se o buffer estiver vazio, espera o produtor produzir um item
        while (buffer.isEmpty()) {
            wait(); // Espera o produtor produzir um item
        }

        // Notifica o produtor que removeu o item do buffer
        notifyAll();


        return buffer.size();
    }
}
