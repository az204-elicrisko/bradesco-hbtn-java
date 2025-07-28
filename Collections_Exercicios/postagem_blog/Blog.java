import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Blog {
    private Set<Post> posts;

    public void adicionarPostagem(Post post) {
        if (posts == null) {
            posts = new HashSet<>();
        } else for (Post p : posts) {
            if (p.compareTo(post) == 0) {
                System.out.println("Postagem jah existente");
                return; // Se a postagem ja existe, nao adiciona novamente
            }
        }
        posts.add(post);
    }

    public Set<Autor> obterTodosAutores() {
        return posts.stream()
                .map(Post::getAutor)
                .collect(java.util.stream.Collectors.toCollection(java.util.TreeSet::new));
    }

    public Map<Categorias, Integer> obterContagemPorCategoria() {
        return posts.stream()
                .collect(java.util.stream.Collectors.groupingBy(Post::getCategoria, 
                    java.util.TreeMap::new,
                    java.util.stream.Collectors.summingInt(p -> 1)
                ));
    }

    public Set<Post> obterPostsPorCategoria(Categorias categoria) {
        return posts.stream()
                .filter(post -> post.getCategoria().equals(categoria))
                .collect(java.util.stream.Collectors.toCollection(
                    () -> new java.util.TreeSet<>((p1, p2) -> p1.getTitulo().compareTo(p2.getTitulo()))
                ));
    }

    public Set<Post> obterPostsPorAutor(Autor autor) {
        return posts.stream()
                .filter(post -> post.getAutor().compareTo(autor) == 0)
                .collect(java.util.stream.Collectors.toCollection(
                    () -> new java.util.TreeSet<>((p1, p2) -> p1.getTitulo().compareTo(p2.getTitulo()))
                ));
    }

    public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias() {
        return posts.stream()
                .collect(java.util.stream.Collectors.groupingBy(Post::getCategoria, 
                    java.util.TreeMap::new,
                    java.util.stream.Collectors.toCollection(
                    () -> new java.util.TreeSet<>((p1, p2) -> p1.getTitulo().compareTo(p2.getTitulo())))
                ));
    }

    public Map<Autor, Set<Post>> obterTodosPostsPorAutor() {
        return posts.stream()
                .collect(java.util.stream.Collectors.groupingBy(Post::getAutor, 
                    java.util.TreeMap::new,
                    java.util.stream.Collectors.toCollection(
                    () -> new java.util.TreeSet<>((p1, p2) -> p1.getTitulo().compareTo(p2.getTitulo())))
                ));
    }
}
