package ApiRest.FisioApp.Model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Fisioterapeutas")
public class Fisioterapeuta extends User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String CRM;
	private int idade;
	private String especialidade;
	
	@Column(name = "created_at")
	private LocalDateTime createdAt;
	 
	@Column(name = "updated_at")
	private LocalDateTime updatedAt;
	
	@OneToMany
	private List<Paciente> pacientes;
	
	@OneToOne
	private Endereco endereco;
	
	

	public Fisioterapeuta(String userName, String password, List<String> type, String name, String cRM, int idade,
			String especialidade, List<Paciente> pacientes) {
		super(userName, password, type);
		this.name = name;
		CRM = cRM;
		this.idade = idade;
		this.especialidade = especialidade;
		this.pacientes = pacientes;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCRM() {
		return CRM;
	}


	public void setCRM(String cRM) {
		CRM = cRM;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getEspecialidade() {
		return especialidade;
	}


	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}


	public List<Paciente> getPacientes() {
		return pacientes;
	}


	public void setPacientes(List<Paciente> pacientes) {
		this.pacientes = pacientes;
	}
	
	
	
	

}
