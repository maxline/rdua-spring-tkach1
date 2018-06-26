package ua.rd.springtkach.logger;

import ua.rd.springtkach.bean.Event;

/**
 * @author Sergey Mikhluk.
 */
public class ConsoleEventLogger  implements EventLogger {
    public void logEvent(Event event){
        System.out.println(event);
    }
}
