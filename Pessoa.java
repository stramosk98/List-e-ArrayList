public class Pessoa {
	
	private String nome;
	private String email;
	private String nascimento;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, String email, String nascimento) {
		super();
		this.nome = nome;
		this.email = email;
		this.nascimento = nascimento;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
		
	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [nome=");
		builder.append(nome);
		builder.append(", email=");
		builder.append(email);
		builder.append(", nascimento=");
		builder.append(nascimento);
		builder.append("]");
		return builder.toString();
	}

	
	
	
}
