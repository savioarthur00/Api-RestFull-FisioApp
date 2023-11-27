package ApiRest.FisioApp.Controller.Dtos;

import ApiRest.FisioApp.Model.Fichas.FichaAnaminese;

public class FichaAnamineseDto {
	
	private int id;	
	private String tipo;		
	
	

	public FichaAnamineseDto(int id, String tipo) {
		super();
		this.id = id;
		this.tipo = tipo;
		
	}



	public FichaAnaminese toModel() {
		FichaAnaminese anaminese = new FichaAnaminese();
		anaminese.setTipo(this.tipo);
		anaminese.setId(this.id);
		
			

		
		return anaminese;
	}
	
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	
	
	
	

}
