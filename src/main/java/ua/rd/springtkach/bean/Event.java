package ua.rd.springtkach.bean;

import java.util.Date;

/**
 * @author Sergey Mikhluk.
 */
public class Event {
    private int id = (int)(Math.random() * 100);
    private String msg;
    private Date date;

    public Event(String msg, Date date) {
        this.msg = msg;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", msg='" + msg + '\'' +
                ", date=" + date +
                '}';
    }
}
