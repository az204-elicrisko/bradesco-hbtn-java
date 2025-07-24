public class PessoasArray {

    private String[] nomes;

    public PessoasArray() {
        nomes =new String[]{"Amanda", "Beatriz", "Carlos","Daniela","Eduardo",
                "Fabio","Gustavo", "Hingrid","Isabela","Joao","Leise","Maria",
                "Norberto","Otavio","Paulo", "Quirino","Renata","Sabata",
                "Tais","Umberto","Vanessa","Xavier"};
    }

    public String[] getNomes() {
        return nomes;
    }

    public void setNomes(String[] nomes) {
        this.nomes = nomes;
    }

    // implementar o método de buscaBinaria
    public void buscaBinaria(String nome) throws IllegalArgumentException {
        boolean encontrado = false;
        System.out.println("Procurando o nome: \"" + nome + "\"");
        int low = 0;
        int high = nomes.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            System.out.println("Passando pelo indice:" + mid);
            if (nome.compareTo(nomes[mid]) < 0) {
                high = mid - 1;
                encontrado = false;
            } else if (nome.compareTo(nomes[mid]) > 0) {
                low = mid + 1;
                encontrado = false;
            } else {
                System.out.println("Nome " + nome + " encontrado na posição " + mid);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            throw new IllegalArgumentException("O nome " + nome + " não se encontra no array de nomes");
        }

    }
}