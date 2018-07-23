package ua.rd.springtkach.question11;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class SomeService implements InitializingBean, DisposableBean {

    private final SomeComponent component;


//    public SomeService() {
//    }

    public SomeComponent getComponent() {
        return component;
    }

//    public void setComponent(SomeComponent component) {
//        this.component = component;
//    }

    public SomeService(SomeComponent component) {
        this.component = component;
    }

    public void init() {
        System.out.print("a");
    }

    public void close() {
        System.out.print("b");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.print("c");
    }

    public void destroy() throws Exception {
        System.out.print("d");
    }

    public void call() {
        component.print();
    }
}