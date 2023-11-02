package ApiRest.FisioApp.Model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

@Entity
@Table(name="tab_pacientes")
public class Paciente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	private String name;
	private int idade;
	private String casoClinico;
	private String avaliacao;
	
	 @Column(name = "created_at")
	 private LocalDateTime createdAt;
	 
	 @Column(name = "updated_at")
	 private LocalDateTime updatedAt;
	
	 
	 @OneToOne
	 private Endereco endereco;
	
	 public Paciente(String name, int idade, String casoClinico, String avaliacao) {
		super();
		this.name = name;
		this.idade = idade;
		this.casoClinico = casoClinico;
		this.avaliacao = avaliacao;
	}


	@PrePersist
	 protected void onCreate() {
	        createdAt = LocalDateTime.now();
	 }

	    
	 @PreUpdate
	 protected void onUpdate() {
	        updatedAt = LocalDateTime.now();
	 }


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getCasoClinico() {
		return casoClinico;
	}


	public void setCasoClinico(String casoClinico) {
		this.casoClinico = casoClinico;
	}


	public String getAvaliacao() {
		return avaliacao;
	}


	public void setAvaliacao(String avaliacao) {
		this.avaliacao = avaliacao;
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
	 
	 
	 
	 
}
