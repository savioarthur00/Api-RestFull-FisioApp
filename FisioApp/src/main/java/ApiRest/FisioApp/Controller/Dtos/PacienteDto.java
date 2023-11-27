package ApiRest.FisioApp.Controller.Dtos;

import ApiRest.FisioApp.Model.Usuarios.Paciente;

public class PacienteDto {
	
	private int id;
	private String name;
	private int idade;
	private String casoClinico;
	private String avaliacao; 	
	private EnderecoDto endereco;
	

	public PacienteDto(int id, String name, int idade, String casoClinico, String avaliacao, EnderecoDto endereco) {
		super();
		this.id = id;
		this.name = name;
		this.idade = idade;
		this.casoClinico = casoClinico;
		this.avaliacao = avaliacao;
		this.endereco = endereco;
	}







	public Paciente toModel() {
		Paciente paciente = new Paciente();
		paciente.setId(this.id);
		paciente.setName(this.name);
		paciente.setIdade(this.idade);
		paciente.setCasoClinico(this.casoClinico);
		paciente.setAvaliacao(this.avaliacao);
		paciente.setEndereco(this.endereco != null ? this.endereco.toModel(): null);
		
		
		
		
		return paciente;
	}
	
}
