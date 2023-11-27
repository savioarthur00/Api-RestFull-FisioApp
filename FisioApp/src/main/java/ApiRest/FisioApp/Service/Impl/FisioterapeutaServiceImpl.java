package ApiRest.FisioApp.Service.Impl;

import java.util.List;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

import ApiRest.FisioApp.Exception.BusinessException;
import ApiRest.FisioApp.Model.Fichas.Evolucao;
import ApiRest.FisioApp.Model.Fichas.FichaAnaminese;
import ApiRest.FisioApp.Model.Usuarios.Fisioterapeuta;
import ApiRest.FisioApp.Model.Usuarios.Paciente;
import ApiRest.FisioApp.Repository.FisioterapeutaRepository;
import ApiRest.FisioApp.Service.FisioterapeutaService;

public class FisioterapeutaServiceImpl implements FisioterapeutaService {

	private FisioterapeutaRepository fisioRepository;
	
	public FisioterapeutaServiceImpl(FisioterapeutaRepository fisioRepository) {
		
		this.fisioRepository = fisioRepository;
	}

	@Override
	public List<Fisioterapeuta> findAll() {
		return fisioRepository.findAll();
	}

	@Override
	public Fisioterapeuta findById(Integer id)  {
		try {
			return fisioRepository.findById(id).orElseThrow(NotFoundException::new);
		} catch (NotFoundException e) {
			
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Fisioterapeuta create(Fisioterapeuta entity) {
		if(entity == null ) {
			new BusinessException("Usuario não pode ser null");
		}if(entity.getCRM()==null) {
			new BusinessException("CRM é obrigatório");
		}
		
		if(fisioRepository.findByCRM(entity.getCRM())){
			new BusinessException("CRM já cadastrado");			
		}
		
		return this.fisioRepository.save(entity);
	}

	@Override
	public Fisioterapeuta update(Integer id, Fisioterapeuta entity) {
		
		return null;
	}

	@Override
	public void delete(Integer id) {
		fisioRepository.deleteById(id);
		
	}

	@Override
	public void realizarEvolucoes(Evolucao evolucao) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void preencherFichaDeAnaminese(FichaAnaminese anaminese) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addPaciente(Paciente paciente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removerPaciente(Paciente paciente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Paciente> getPaciente() {
		// TODO Auto-generated method stub
		return null;
	}

	

	
	
	
	

}
