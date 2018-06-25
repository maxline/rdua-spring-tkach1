package ua.rd.springtkach.logger;

/**
 * @author Sergey Mikhluk.
 */
public class ConsoleEventLogger  implements EventLogger {
    public void logEvent(String msg){
        System.out.println(msg);
    }
}
