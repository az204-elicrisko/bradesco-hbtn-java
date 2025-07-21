import java.util.ArrayList;

public class ProcessadorVideo {
    ArrayList<CanalNotificacao> canais;

    public void registrarCanal(CanalNotificacao canal) {
        if (canais == null) {
            canais = new ArrayList<>();
        }
        canais.add(canal);
    }

    public void processar(Video video) {
        Mensagem mensagem = new Mensagem();
        mensagem.setTexto(String.format("%s - %s", video.getArquivo(), video.getFormato()));
        mensagem.setTipoMensagem(TipoMensagem.LOG);
        if (canais != null) {
            for (CanalNotificacao canal : canais) {
                canal.notificar(mensagem);
            }
        } 
    }
}
