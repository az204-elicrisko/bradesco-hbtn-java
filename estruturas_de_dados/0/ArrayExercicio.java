import java.util.Scanner;


public class ArrayExercicio {


    public static void main(String[] args) {
        // Criando o scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);


        // Definindo o tamanho do array
        int tamanhoArray = 10;
        int[] numeros = new int[tamanhoArray];
        int soma = 0;
        int maiorNumero = Integer.MIN_VALUE;


        // Preenchendo o array com números fornecidos pelo usuário
        // Utilize scanner.nextInt(); para receber o numero digitado
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < tamanhoArray; i++) {
            numeros[i] = scanner.nextInt();
            // Calculando a soma dos números
            soma += numeros[i];
            // Verificando o maior número
            if (numeros[i] > maiorNumero) {
                maiorNumero = numeros[i];
            }
        }
        for (int i = 0; i < tamanhoArray; i++) {
            System.out.println("Digite o número " + (i + 1) + ": " + numeros[i]);
        }

        // Exibindo os resultados
        System.out.println("\n");
        System.out.println("Conteúdo do array:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println(" ");
        System.out.println("Soma de todos os números: " + soma);
        System.out.println("Maior número no array: " + maiorNumero);

        // Fechando o scanner
        scanner.close();
    }
}
