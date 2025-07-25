class PersonagemGame {
	private int saudeAtual;
	private String nome;
	public int getSaudeAtual() {
		return saudeAtual;
	}
	public void setSaudeAtual(int saudeAtual) {
		this.saudeAtual = saudeAtual;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void tomarDano(int quantidadeDeDano) {
		if (quantidadeDeDano < 0) {
			return;
		}
		this.saudeAtual -= quantidadeDeDano;
		if (this.saudeAtual < 0) {
			this.saudeAtual = 0;
		}
	}
	
	public void receberCura(int quantidadeDeCura) {
		this.saudeAtual += quantidadeDeCura;
		if (this.saudeAtual > 100) {
			this.saudeAtual = 100;
		}
	}
}