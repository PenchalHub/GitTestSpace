package springsecurity.eazybytes.bank.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 * @author Admin
 *
 */
@Entity
public class Users {

	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
//	@GenericGenerator(name = "native",strategy = "native")
	private int id;
	private String username;
	private String password;
	private int enabled=1;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return " {username:" + username + ", password:" + password + "}";
	}

	

}
