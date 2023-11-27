package ApiRest.FisioApp.Model.Informacoes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tab_enderecos")
public class Endereco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int endereco_Id;
	
	private String rua;
	private String cep;
	private String numero;
	private String bairro;
		
	@Override
	public String toString() {
		return "Endereco [rua=" + rua + ", cep=" + cep + ", numero=" + numero + ", bairro=" + bairro + "]";
	}
	public Endereco(String rua, String cep, String numero, String bairro) {
		super();
		this.rua = rua;
		this.cep = cep;
		this.numero = numero;
		this.bairro = bairro;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public int getEndereco_Id() {
		return endereco_Id;
	}
	
	
	
	

}
