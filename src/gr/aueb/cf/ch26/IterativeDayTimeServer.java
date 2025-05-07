package gr.aueb.cf.ch26;

/**
 * Initiates thread
 */
public class IterativeDayTimeServer {
    public static void main(String[] args) {
        DateTimeServer dateTimeServer = new DateTimeServer();
        dateTimeServer.start();
    }
}
