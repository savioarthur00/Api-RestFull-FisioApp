package ApiRest.FisioApp.Model.Usuarios;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import ApiRest.FisioApp.Model.User;
import ApiRest.FisioApp.Model.Informacoes.Identificacao;

@Entity
@Table(name="Fisioterapeutas")
public class Fisioterapeuta extends User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String CRM;
	private String especialidade;
	private Identificacao identificacao;
	
	@Column(name = "created_at")
	private LocalDateTime createdAt;
	 
	@Column(name = "updated_at")
	private LocalDateTime updatedAt;
	
	@OneToMany
	private List<Paciente> pacientes;
		


	public Fisioterapeuta(String cRM, String especialidade, Identificacao identificacao, LocalDateTime createdAt,
			LocalDateTime updatedAt, List<Paciente> pacientes) {
		super();
		CRM = cRM;
		this.especialidade = especialidade;
		this.identificacao = identificacao;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.pacientes = pacientes;
	}
	public Fisioterapeuta() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCRM() {
		return CRM;
	}
	public void setCRM(String cRM) {
		CRM = cRM;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
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
	public List<Paciente> getPacientes() {
		return pacientes;
	}

	public void setPacientes(List<Paciente> pacientes) {
		this.pacientes = pacientes;
	}
	public Identificacao getIdentificacao() {
		return identificacao;
	}
	public void setIdentificacao(Identificacao identificacao) {
		this.identificacao = identificacao;
	}

	
	


	
	
	

}
