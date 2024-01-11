package ApiRest.FisioApp.Model.Fichas;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import ApiRest.FisioApp.Model.Informacoes.Identificacao;


@Entity
@Table(name="fichas")
public class FichaAnaminese {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String tipo;
	
	@OneToOne	
	private Identificacao identificacao;
	
	
		

	public FichaAnaminese() {
		super();
	}

		
	

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public Identificacao getIdentificacao() {
		return identificacao;
	}

	public void setIdentificacao(Identificacao identificacao) {
		this.identificacao = identificacao;
	}
	
	
	
	
	
	
}
