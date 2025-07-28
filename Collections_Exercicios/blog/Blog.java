import java.util.List;
import java.util.Map;
import java.util.Set;

public class Blog {
    private List<Post> posts;

    public void adicionarPostagem(Post post) {
        if (posts == null) {
            posts = new java.util.ArrayList<>();
        }
        posts.add(post);
    }

    public Set<String> obterTodosAutores() {
        return posts.stream()
                .map(Post::getAutor)
                .collect(java.util.stream.Collectors.toCollection(java.util.TreeSet::new));
    }

    public Map<String, Integer> obterContagemPorCategoria() {
        return posts.stream()
                .collect(java.util.stream.Collectors.groupingBy(Post::getCategoria, 
                    java.util.TreeMap::new,
                    java.util.stream.Collectors.summingInt(p -> 1)
                ));
    }
}
