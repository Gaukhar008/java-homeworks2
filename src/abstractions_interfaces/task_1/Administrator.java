package task_1;

public interface Administrator {
    void giveBooks(Reader reader);
    void takeBooks(Reader reader);
    void overdueNotification(Reader reader);
}
