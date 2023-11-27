package ApiRest.FisioApp.Controller.Dtos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import ApiRest.FisioApp.Model.Usuarios.Fisioterapeuta;
import ApiRest.FisioApp.Model.Usuarios.Paciente;
public class UserFisioterapeutaDto {
	
	private int id;
	private String name;
	private String CRM;
	private int idade;
	private String especialidade;
	private String password;
	private String username;		
	private List<PacienteDto> pacientes;		
	private EnderecoDto endereco;
	
		
	
	public Fisioterapeuta toModel() {
		Fisioterapeuta fisioterapeuta = new Fisioterapeuta();
		fisioterapeuta.setId(this.id);
		fisioterapeuta.setCRM(this.CRM);
		fisioterapeuta.setEspecialidade(this.especialidade);
		fisioterapeuta.setIdade(this.idade);
		fisioterapeuta.setPassword(this.password);
		fisioterapeuta.setUserName(this.username);
		fisioterapeuta.setName(this.name);
		fisioterapeuta.setEndereco(this.endereco != null ? this.endereco.toModel():null);
		
		if (this.pacientes != null) {
	        List<Paciente> pacientesList = new ArrayList<>();
	        for (PacienteDto pacienteDto : this.pacientes) {
	            pacientesList.add(pacienteDto.toModel());
	        }
	        fisioterapeuta.setPacientes(pacientesList);
	    } else {
	        fisioterapeuta.setPacientes(Collections.emptyList());
	    }
		return fisioterapeuta;
	}
	

	public UserFisioterapeutaDto(int id, String name, String cRM, int idade, String especialidade,
			List<PacienteDto> pacientes, EnderecoDto endereco) {
		super();
		this.id = id;
		this.name = name;
		CRM = cRM;
		this.idade = idade;
		this.especialidade = especialidade;
		this.pacientes = pacientes;
		this.endereco = endereco;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof UserFisioterapeutaDto))
			return false;
		UserFisioterapeutaDto other = (UserFisioterapeutaDto) obj;
		return Objects.equals(CRM, other.CRM) && Objects.equals(endereco, other.endereco)
				&& Objects.equals(especialidade, other.especialidade) && id == other.id && idade == other.idade
				&& Objects.equals(name, other.name) && Objects.equals(pacientes, other.pacientes);
	}
	
	
}
