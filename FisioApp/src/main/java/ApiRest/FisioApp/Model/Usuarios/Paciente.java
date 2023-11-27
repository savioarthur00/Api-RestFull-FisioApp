package ApiRest.FisioApp.Model.Usuarios;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import ApiRest.FisioApp.Model.Fichas.FichaAnaminese;
import ApiRest.FisioApp.Model.Informacoes.Identificacao;

@Entity
@Table(name="tab_pacientes")
public class Paciente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private Identificacao identificacao;	
	private String casoClinico;	
	
	@OneToOne
	private List<FichaAnaminese> fichasAnaminese ;
	
	
	 @Column(name = "created_at")
	 private LocalDateTime createdAt;
	 
	 @Column(name = "updated_at")
	 private LocalDateTime updatedAt;
	
	 
	 

	public Paciente(Identificacao identificacao, String casoClinico, List<FichaAnaminese> fichasAnaminese) {
		super();
		this.identificacao = identificacao;
		this.casoClinico = casoClinico;
		this.fichasAnaminese = fichasAnaminese;
	}

	public Paciente() {
		// TODO Auto-generated constructor stub
	}
	
	public Identificacao getIdentificacao() {
		return identificacao;
	}

	public void setIdentificacao(Identificacao identificacao) {
		this.identificacao = identificacao;
	}


	@PrePersist
	 protected void onCreate() {
	        createdAt = LocalDateTime.now();
	 }

	    
	 @PreUpdate
	 protected void onUpdate() {
	        updatedAt = LocalDateTime.now();
	 }

	public String getCasoClinico() {
		return casoClinico;
	}


	public void setCasoClinico(String casoClinico) {
		this.casoClinico = casoClinico;
	}


	public LocalDateTime getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}


	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}


	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}


	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}
	 
	
	 
	 
}
