 public class SistemaFilas {
    public static void main(String[] args) {
        Fila buffer = new Fila();
        Thread produtor = new Thread(new Produtor(buffer));     
        Thread produtor2Thread = new Thread(new Produtor(buffer));     
        Thread consumidor = new Thread(new Consumidor(buffer));     
        Thread consumidor2Thread = new Thread(new Consumidor(buffer));

        produtor.start();
        produtor2Thread.start();
        consumidor.start(); 
        consumidor2Thread.start();


        try {
            Thread.sleep(20000); // Executa por 20 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.exit(0);
    }
}

