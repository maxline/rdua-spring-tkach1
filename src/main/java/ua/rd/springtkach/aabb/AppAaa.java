package ua.rd.springtkach.aabb;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.rd.springtkach.bean.Client;
import ua.rd.springtkach.bean.Event;
import ua.rd.springtkach.logger.ConsoleEventLogger;
import ua.rd.springtkach.logger.EventLogger;

public class AppAaa {

    public static void main(String[] args) {
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("aabb.xml");
//        System.out.println(ctx.getBean("a"));
//        System.out.println(ctx.getBean("b"));
//        System.out.println(ctx.getBean("a"));
//        System.out.println(ctx.getBean("b"));

        ApplicationContext ctx = new ClassPathXmlApplicationContext("abstract.xml");
        System.out.println(ctx.getBean("eee"));

    }


}
