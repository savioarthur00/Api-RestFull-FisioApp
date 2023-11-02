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
	@CollectionTable(name="tab_user_type", joinColumns = @JoinColumn(name="user_id"))
	@Column(name="type_id")
	private List<String> type = new ArrayList<String>();


	
	
	
	public User(String userName, String password, List<String> type) {
		super();
		this.userName = userName;
		this.password = password;
		this.type = type;
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


	public List<String> getType() {
		return type;
	}


	public void setType(List<String> type) {
		this.type = type;
	}


	public int getId() {
		return id;
	}
	
	
	
	

}
