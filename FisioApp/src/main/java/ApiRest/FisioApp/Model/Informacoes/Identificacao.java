package ApiRest.FisioApp.Model.Informacoes;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Identificacao {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	private String nome;
	private String sexo;
	private String estadoCivil;
	private int idade;
	private String raça;
	private String profissao;
	private String ocupacao;
	private Contato contato;
	private Endereco endereco;
	
	
	
	
	public Identificacao(String nome, String sexo, String estadoCivil, int idade, String raça, String profissao,
			String ocupacao, Contato contato, Endereco endereco) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
		this.idade = idade;
		this.raça = raça;
		this.profissao = profissao;
		this.ocupacao = ocupacao;
		this.contato = contato;
		this.endereco = endereco;
	}

	public int getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getRaça() {
		return raça;
	}
	public void setRaça(String raça) {
		this.raça = raça;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public String getOcupacao() {
		return ocupacao;
	}
	public void setOcupacao(String ocupacao) {
		this.ocupacao = ocupacao;
	}
	public Contato getContato() {
		return contato;
	}
	public void setContato(Contato contato) {
		this.contato = contato;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	


	
	
	
	
	
	
	

}
