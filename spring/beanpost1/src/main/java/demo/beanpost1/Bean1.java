/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.beanpost1;

import org.springframework.stereotype.Component;

/**
 *
 * @author tangfanghua
 */
@Component
public class Bean1 {

    public Bean1() {
        System.out.println("Bean1()");
    }

    public void sayHello(String name) {
        System.out.println("hello" + name);
    }
}
