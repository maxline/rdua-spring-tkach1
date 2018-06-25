package ua.rd.springtkach;

import ua.rd.springtkach.bean.Client;
import ua.rd.springtkach.logger.ConsoleEventLogger;
import ua.rd.springtkach.logger.EventLogger;

/**
 * @author Sergey Mikhluk.
 */
public class App {
    private Client client;
    private EventLogger eventLogger;

    public static void main(String[] args) {
        App app = new App();
        app.logEvent("some event for user 1");
    }

    public App() {
    }

    public App(Client client, EventLogger eventLogger) {
        this.client = client;
        this.eventLogger = eventLogger;
    }

    public void logEvent(String msg){
        String message = msg.replaceAll(client.getId(), client.getFullName());
        eventLogger.logEvent(message);
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public EventLogger getEventLogger() {
        return eventLogger;
    }

    public void setEventLogger(ConsoleEventLogger eventLogger) {
        this.eventLogger = eventLogger;
    }
}
