package bakingsystem;

public class UserDTO {
	private static String id;
	private static String password;
	
	public UserDTO() {
	}
	
	public UserDTO(String id, String password) {
		super();
		this.id = id;
		this.password = password;
	}
	
	public static String getId() {
		return id;
	}

	public static void setId(String id) {
		UserDTO.id = id;
	}

	public static String getPassword() {
		return password;
	}

	public static void setPassword(String password) {
		UserDTO.password = password;
	}
}
