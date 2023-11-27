package ApiRest.FisioApp.Controller.Dtos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import ApiRest.FisioApp.Model.Usuarios.Fisioterapeuta;
import ApiRest.FisioApp.Model.Usuarios.Paciente;
public class UserFisioterapeutaDto {
	
	private int id;
	private String especialidade;
	private String password;
	private String username;		
	private List<PacienteDto> pacientes;		
	private String crm;	
	private IdentificacaoDto identificacao;
	
		

	public UserFisioterapeutaDto(String especialidade, String password, String username, List<PacienteDto> pacientes,
			String crm, IdentificacaoDto identificacao) {
		super();
		this.especialidade = especialidade;
		this.password = password;
		this.username = username;
		this.pacientes = pacientes;
		this.crm = crm;
		this.identificacao = identificacao;
	}



	public Fisioterapeuta toModel() {
		Fisioterapeuta fisioterapeuta = new Fisioterapeuta();
		fisioterapeuta.setId(this.id);
		fisioterapeuta.setCRM(this.crm);
		fisioterapeuta.setEspecialidade(this.especialidade);
		fisioterapeuta.setPassword(this.password);
		fisioterapeuta.setUserName(this.username);		
		fisioterapeuta.setIdentificacao(this.identificacao != null ? this.identificacao.toModel():null);
		
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
	


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof UserFisioterapeutaDto))
			return false;
		UserFisioterapeutaDto other = (UserFisioterapeutaDto) obj;
		return Objects.equals(crm, other.crm) && Objects.equals(identificacao, other.identificacao)
				&& Objects.equals(especialidade, other.especialidade) && id == other.id && identificacao == other.identificacao
				&& Objects.equals(pacientes, other.pacientes);
	}
	
	
}
