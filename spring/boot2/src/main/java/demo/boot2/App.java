/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.boot2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.XADataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jmx.JmxAutoConfiguration;
import org.springframework.boot.autoconfigure.websocket.servlet.WebSocketServletAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 *
 * @author tangfanghua
 */
@ComponentScan
@EnableAutoConfiguration
//@SpringBootApplication(exclude = {JmxAutoConfiguration.class,
//    WebSocketServletAutoConfiguration.class,
//    XADataSourceAutoConfiguration.class})

public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
