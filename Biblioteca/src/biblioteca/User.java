package biblioteca;

class User implements Usuario {
    private int code;
    private String name;
    private UserType tipo;
    public User(int code, String name, UserType tipo) {
        this.code = code;
        this.name = name;
        this.tipo = tipo;
    }

    public User() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getCode() {
        return code;
    }

    @Override
	public String getName() {
        return name;
    }

	public UserType getTipo() {
		return tipo;
	}

	public void setTipo(UserType tipo) {
		this.tipo = tipo;
	}

    // Outros métodos e atributos necessários
}
