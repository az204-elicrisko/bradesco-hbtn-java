import exceptions.*;

public class Livro {

    private String titulo;
    private String autor;
    protected double preco;

    public Livro(String titulo, String autor, double preco)  throws LivroInvalidoException, AutorInvalidoException{
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setPreco(preco);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) throws LivroInvalidoException {
        if (titulo == null || titulo.isEmpty()) {
            throw new LivroInvalidoException("Titulo de livro invalido");
        }
        if (titulo.length() < 3) {
            throw new LivroInvalidoException("Titulo de livro invalido");
        }
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor)  throws AutorInvalidoException{
        if (autor == null || autor.isEmpty()) {
            throw new AutorInvalidoException("Nome de autor invalido");
        } 
        if (autor.contains(" ")) {
            String[] partes = autor.split(" ");
            if (partes.length < 2) {
                throw new AutorInvalidoException("Nome de autor invalido");
            }
        } else {
            throw new AutorInvalidoException("Nome de autor invalido");
        }
        this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) throws LivroInvalidoException {
        if (preco <= 0) {
            throw new LivroInvalidoException("Preco de livro invalido");
        }
        this.preco = preco;
    }
}
