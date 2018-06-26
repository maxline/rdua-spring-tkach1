package ua.rd.springtkach.logger;

import ua.rd.springtkach.bean.Event;

public interface EventLogger {
    void logEvent(Event event);
}
