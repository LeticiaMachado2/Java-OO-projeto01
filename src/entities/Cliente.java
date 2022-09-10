package entities;

//definição da classe
public class Cliente {

	// atributos (dados)
	private Integer idCliente;
	private String nome;
	private String email;
	private String cpf;

	public void setIdCliente(Integer idCliente) {
		if (idCliente > 0)
			this.idCliente = idCliente;
		else
			throw new IllegalArgumentException("O Id do Cliente deve ser maior do que zero.");
	}

	public Integer getIdCliente() {
		return idCliente;
	}
//trim - remove os espaços antes e depois dos textos
	public void setNome(String nome) {
		if(nome != null && nome.trim().length() > 0)
			this.nome = nome;
		else
//throw new - força a dar o erro - (provoca)
			throw new IllegalArgumentException("O nome do cliente é obrigatorio");
	}

	public String getNome() {
		return nome;
	}

	public void setEmail(String email) {
		if(email!= null && email.trim().length() > 0)
			this.email = email;
		else
			throw new IllegalArgumentException("O email do cliente é obrigatorio");
	}

	public String getEmail() {
		return email;
	}

	public void setCpf(String cpf) {
		if(cpf != null && cpf.trim().length() > 0)
			this.cpf = cpf;
		throw new IllegalArgumentException("O cpf do cliente é obrigatorio");
	}

	public String getCpf() {
		return cpf;
	}
}
