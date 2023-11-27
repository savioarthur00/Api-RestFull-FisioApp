package ApiRest.FisioApp.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="tab_user")
public abstract class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String userName;	
	private String password;	
	
	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name="tab_user_perfil", joinColumns = @JoinColumn(name="user_id"))
	@Column(name="perfil_id")
	private List<String> perfil = new ArrayList<String>();

	
	
	
	public User() {
		super();
	}

	

	public void setId(int id) {
		this.id = id;
	}



	public User(String userName, String password, List<String> perfil) {
		super();
		this.userName = userName;
		this.password = password;
		this.perfil = perfil;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	


	public List<String> getPerfil() {
		return perfil;
	}



	public void setPerfil(List<String> perfil) {
		this.perfil = perfil;
	}



	public int getId() {
		return id;
	}
	
	
	
	

}
