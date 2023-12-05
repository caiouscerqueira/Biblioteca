package biblioteca;

class Professor extends User {
    private int notificationCount;

    public Professor(int code, String name) {
        super(code, name);
        this.notificationCount = 0;
    }

    public int getNotificationCount() {
        return notificationCount;
    }

    public void incrementNotificationCount() {
        notificationCount++;
    }
}

