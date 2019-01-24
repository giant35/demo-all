/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.jpa1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author tangfanghua
 */
@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
//
//    @Bean
//    public CommandLineRunner r(UserRepository repo) {
//        return (argv) -> {
//            final User u = repo.findById(10300).get();
//            System.out.println(u.getPu().getId());
//        };
//    }

    @Bean
    public CommandLineRunner r2(WXPublicUserRepo repo,UserRepository up) {
        return (argv) -> {            
            final WXPublicUser u = repo.findByWxUnionId("o6uc051kVQkT8jyMYo6hbwxSio-M");
            System.out.println("u:"+u.getUser().getId());
            final User u2 = up.findById(10300).get();
            System.out.println("u2:"+u2.getId());
        };
    }
}
