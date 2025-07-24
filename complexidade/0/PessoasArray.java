
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

    // implementar o mehtodo de pesquisaConstante
    public void pesquisaTempoConstante(int id) throws IllegalArgumentException {
        try {
            System.out.println("Nome pesquisado e " + nomes[id] + " que esta na posicao " + id);
        } catch (Exception ex) {
            throw new IllegalArgumentException("O array de nomes possui :" + nomes.length + " nomes.");
        }
    }
}
