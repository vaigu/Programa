public class Pessoa {

	private int pessoaID;
	private String nome;
	private String cidade;
	private int idade;

	public Pessoa(int pessoaID, String nome, String cidade, int idade) {
		super();
		this.pessoaID = pessoaID;
		this.nome = nome;
		this.cidade = cidade;
		this.idade = idade;
	}

	public Pessoa(String nome, String cidade, int idade) {
		super();
		this.pessoaID = 1;
		this.nome = nome;
		this.cidade = cidade;
		this.idade = idade;
	}

	
	public int getPessoaID() {
		return pessoaID;
	}

	public String getNome() {
		return nome;
	}

	public String getCidade() {
		return cidade;
	}

	public int getIdade() {
		return idade;
	}

	@Override
	public String toString() {
		return String.format(
				"Conta [contaId=%s, cpf=%s, nome=%s, numero=%s]", pessoaID,
				nome, cidade, idade);
	}

}