package ApiRest.FisioApp.Model.Sintomas;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sintomas")
public class Sintomas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
		
	
	
	public Sintomas(String nome) {
		super();
		this.nome = nome;
		
		
	}
	
	
	@Override
	public String toString() {
		return "Sintomas [nome=" + nome + "]";
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	

}
