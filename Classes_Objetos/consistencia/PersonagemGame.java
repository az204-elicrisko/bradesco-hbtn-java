class PersonagemGame {
	private int saudeAtual;
	private String nome;
	private String status;

	PersonagemGame(int saudeAtual, String nome) {
		this.nome = nome;
		this.setSaudeAtual(saudeAtual);
	}

	public int getSaudeAtual() {
		return saudeAtual;
	}
	public void setSaudeAtual(int saudeAtual) {
		this.saudeAtual = saudeAtual;
		if (this.saudeAtual <= 0) {
			this.status = "morto";
		} else if (this.saudeAtual > 0) {
			this.status = "vivo";
		}
	}
	public String getStatus() {
		return status;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if (nome == null || nome.isEmpty()) {
			return; // Evita nomes inválidos
		}
		this.nome = nome;
	}

	public void tomarDano(int quantidadeDeDano) {
		if (quantidadeDeDano < 0) {
			return;
		}
		setSaudeAtual(this.saudeAtual - quantidadeDeDano);
		if (this.saudeAtual < 0) {
			this.saudeAtual = 0;
		}
	}
	
	public void receberCura(int quantidadeDeCura) {
		setSaudeAtual(this.saudeAtual + quantidadeDeCura);
		if (this.saudeAtual > 100) {
			this.saudeAtual = 100;
		}
	}
}