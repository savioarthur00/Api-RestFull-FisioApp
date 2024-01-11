package ApiRest.FisioApp.Model.Fichas;

import java.sql.Date;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import ApiRest.FisioApp.Model.Usuarios.Paciente;

@Entity
@Table(name="fichas")
public class Evolucao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private Date date;
	private String descricaoGeraldoEstado;
	private String condutaAplicada;
	private String eventuaisIntercorrencias;
	
	@ManyToMany
	private Paciente paciente;
	
	 @Column(name = "created_at")
	 private LocalDateTime createdAt;
	 
	 @Column(name = "updated_at")
	 private LocalDateTime updatedAt;
	
	 private String assinatura;
		
	
	public Evolucao() {
		super();
	}
	
	
	
	
	public Evolucao(int id, Date date, String descricaoGeraldoEstado, String condutaAplicada,
			String eventuaisIntercorrencias, Paciente paciente, String assinatura) {
		super();
		this.id = id;
		this.date = date;
		this.descricaoGeraldoEstado = descricaoGeraldoEstado;
		this.condutaAplicada = condutaAplicada;
		this.eventuaisIntercorrencias = eventuaisIntercorrencias;
		this.paciente = paciente;
		this.assinatura = assinatura;
	}




	@Override
	public String toString() {
		return "Evolucao [id=" + id + ", date=" + date + ", descricaoGeraldoEstado=" + descricaoGeraldoEstado
				+ ", condutaAplicada=" + condutaAplicada + ", eventuaisIntercorrencias=" + eventuaisIntercorrencias
				+ "]";
	}

	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getDescricaoGeraldoEstado() {
		return descricaoGeraldoEstado;
	}
	public void setDescricaoGeraldoEstado(String descricaoGeraldoEstado) {
		this.descricaoGeraldoEstado = descricaoGeraldoEstado;
	}
	public String getCondutaAplicada() {
		return condutaAplicada;
	}
	public void setCondutaAplicada(String condutaAplicada) {
		this.condutaAplicada = condutaAplicada;
	}
	public String getEventuaisIntercorrencias() {
		return eventuaisIntercorrencias;
	}
	public void setEventuaisIntercorrencias(String eventuaisIntercorrencias) {
		this.eventuaisIntercorrencias = eventuaisIntercorrencias;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public String getAssinatura() {
		return assinatura;
	}
	public void setAssinatura(String assinatura) {
		this.assinatura = assinatura;
	}
	
	
	
	
	
	
	
	

}
