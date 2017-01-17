package entities;
/*
 * Class , representing account entity
 */
public class Account {
	private String login;
	private String password;
	private long id;
	
	public Account(String login, String password) {
		this.login = login;
		this.password = password;
	}
	
	public Account(long id, String login, String password) {
		this.login = login;
		this.password = password;
		this.id = id;
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	
	
}
