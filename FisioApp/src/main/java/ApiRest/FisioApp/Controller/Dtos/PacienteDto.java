package ApiRest.FisioApp.Controller.Dtos;

import ApiRest.FisioApp.Model.Usuarios.Paciente;

public class PacienteDto {
	
	private int id;
	private IdentificacaoDto identificacao;	
	private String casoClinico;	
	private FichaAnamineseDto fichasAnaminese ;
	
		

	public PacienteDto(IdentificacaoDto identificacao, String casoClinico, FichaAnamineseDto fichasAnaminese) {
		super();
		this.identificacao = identificacao;
		this.casoClinico = casoClinico;
		this.fichasAnaminese = fichasAnaminese;
	}

	public Paciente toModel() {
		Paciente paciente = new Paciente();
		paciente.setId(this.id);
		paciente.setIdentificacao(this.identificacao != null ? this.identificacao.toModel():null);
		paciente.setFichaAnaminese(this.fichasAnaminese != null ? this.fichasAnaminese.toModel():null);	
		paciente.setCasoClinico(this.casoClinico);
		
		
		
		return paciente;
	}
	
}
