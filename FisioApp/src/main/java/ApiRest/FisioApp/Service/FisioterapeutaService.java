package ApiRest.FisioApp.Service;

import java.util.List;

import ApiRest.FisioApp.Model.Fichas.Evolucao;
import ApiRest.FisioApp.Model.Fichas.FichaAnaminese;
import ApiRest.FisioApp.Model.Usuarios.Fisioterapeuta;
import ApiRest.FisioApp.Model.Usuarios.Paciente;

public interface FisioterapeutaService extends CrudService<Integer,Fisioterapeuta> {

	public void realizarEvolucoes(Evolucao evolucao);
	public void preencherFichaDeAnaminese(FichaAnaminese anaminese);
	public void addPaciente(Paciente paciente);
	public void removerPaciente(Paciente paciente);
	public List<Paciente> getPaciente();
	
	
}
