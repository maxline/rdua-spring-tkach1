package ua.rd.springtkach;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.rd.springtkach.bean.Client;
import ua.rd.springtkach.bean.Event;
import ua.rd.springtkach.logger.ConsoleEventLogger;
import ua.rd.springtkach.logger.EventLogger;

/**
 * @author Sergey Mikhluk.
 */
public class App {
    private Client client;
    private EventLogger eventLogger;

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        App app = (App) ctx.getBean("app");

        Event event = (Event) ctx.getBean("event");
        System.out.println(event);
        app.logEvent("some event for user 1", event);

        event = (Event) ctx.getBean("event");
        app.logEvent("some event for user 2", event);
    }

    public App() {
    }

    public App(Client client, EventLogger eventLogger) {
        this.client = client;
        this.eventLogger = eventLogger;
    }

    public void logEvent(String msg, Event event){
        String message = msg.replaceAll(client.getId(), client.getFullName());
        event.setMsg(message);

        eventLogger.logEvent(event);
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
