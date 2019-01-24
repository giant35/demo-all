/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.beanpost1;

import java.util.logging.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author tangfanghua
 */
public class App {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("hello");
        final var ctx = new AnnotationConfigApplicationContext("demo.beanpost1");
        ctx.start();
        LOG.info("before getBean");
        Thread.sleep(1000);

        final var b = ctx.getBean(Bean1.class);
        System.out.println("after getBean");
        Thread.sleep(1000);
        LOG.info("before sayhello");
        b.sayHello(" tom");

        ctx.stop();
    }
    private static final Logger LOG = Logger.getLogger(App.class.getName());
}
