package biblioteca;

interface Usuario {

	int getCode();

	String getName();

	UserType getTipo();

	void setTipo(UserType tipo);

	Usuario addUser(int code, String name, UserType type);

}