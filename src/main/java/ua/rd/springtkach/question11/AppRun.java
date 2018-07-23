package ua.rd.springtkach.question11;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppRun {
    public static void main(String[] args) {
        ConfigurableApplicationContext appCtx =
                new ClassPathXmlApplicationContext("question11.xml");

        SomeService service = appCtx.getBean(SomeService.class);
        service.call();


//        CustomerService cust = (CustomerService)appCtx.getBean("customerService");
//
//        System.out.println(cust);


        appCtx.close();
    }
}