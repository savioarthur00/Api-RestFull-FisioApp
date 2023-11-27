package ApiRest.FisioApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ApiRest.FisioApp.Model.Usuarios.Fisioterapeuta;

public interface FisioterapeutaRepository extends JpaRepository<Fisioterapeuta,Integer>{

	boolean findByCRM(String string);

}
