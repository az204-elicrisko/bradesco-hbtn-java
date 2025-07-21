import java.util.ArrayList;

import atividades.*;

public class Workflow {

    ArrayList<Atividade> atividades;

    public ArrayList<Atividade> getAtividades() {
        return atividades;
    }
    public Workflow() {
        atividades = new ArrayList<>();
    }

    public void registrarAtividade(Atividade atividade) {
        atividades.add(atividade);
    }
}