package biblioteca;

class Professor extends User {
    private int notificationCount;
    
    private final static int DIAS_EMPRESTIMO = 7; 
    
    public Professor(int code, String name, UserType tipo) {
        super(code, name, tipo);
        this.notificationCount = 0;
    }

    public int getNotificationCount() {
        return notificationCount;
    }

    public void incrementNotificationCount() {
        notificationCount++;
    }
}

