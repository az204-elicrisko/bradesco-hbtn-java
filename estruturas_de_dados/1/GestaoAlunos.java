import java.util.ArrayList;

public class GestaoAlunos {
    private ArrayList<Aluno> alunos;

    public static void main(String[] args) {
        GestaoAlunos gestao = new GestaoAlunos();
        
        Aluno aluno1 = new Aluno("João", 20);
        Aluno aluno2 = new Aluno("Maria", 22);
        Aluno aluno3 = new Aluno("Maria Joaquina", 18);
        
        gestao.adicionarAluno(aluno1);
        gestao.adicionarAluno(aluno2);
        gestao.adicionarAluno(aluno3);
        
        System.out.println("Lista de alunos:");
        gestao.listarAlunos();
        
        System.out.println("\nBuscando aluno 'João':");
        gestao.buscarAluno("João");
        
        System.out.println("\nExcluindo aluno 'Maria'.");
        gestao.excluirAluno("Maria");

        if (gestao.excluirAluno("Maria")) {
            System.out.println("Aluno 'Maria' excluído com sucesso.");
        } else {
            gestao.buscarAluno("Maria Joaquina");
        }
        
        System.out.println("\nLista de alunos após exclusão:");
        gestao.listarAlunos();
    }
    
    public void adicionarAluno(Aluno aluno) {
        if (alunos == null) {
            alunos = new ArrayList<>();
        }
        alunos.add(aluno);
    }

    public boolean excluirAluno(String nome) {
        if (alunos != null) {
            for (Aluno aluno : alunos) {
                if (aluno.getNome().equalsIgnoreCase(nome)) {
                    alunos.remove(aluno);
                    return true;
                }
            }
            return false; // Aluno não encontrado
        } else {
            return false; // Nenhum aluno cadastrado
        }
    }

    public void buscarAluno(String nome) {
        if (alunos != null) {
            for (Aluno aluno : alunos) {
                if (aluno.getNome().equalsIgnoreCase(nome)) {
                    System.out.println(aluno.toString());
                    return;
                }
            }
            System.out.println("Aluno não encontrado.");
        } else {
            System.out.println("Nenhum aluno cadastrado.");
        }
    }

    public void listarAlunos() {
        for (int i = 0; i < alunos.size(); i++) {
            System.out.println(alunos.get(i).toString());
        }
    }
}
