package privatePractice;

public class Mapping {
	public String id;
	public String password;
	
	public Mapping() {
		
	}
	
	public Mapping(String id, String password) {
		this.id = id;
		this.password = password;
	}
	
	public void getMapping() {
		System.out.println("id : " + id + "password: " + password);
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
