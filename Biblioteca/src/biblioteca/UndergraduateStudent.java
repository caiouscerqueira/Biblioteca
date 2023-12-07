	package biblioteca;

	// Classes específicas para cada tipo de usuário
	class UndergraduateStudent extends User {
		
		private final static int DIAS_EMPRESTIMO = 3; 
		
	    public UndergraduateStudent(int code, String name, UserType tipo) {
	        super(code, name, tipo);
	    }
	}