/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thelook.redis1;

import java.util.concurrent.TimeUnit;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.core.StringRedisTemplate;

/**
 *
 * @author tangfanghua
 */
@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Bean
    public CommandLineRunner r(StringRedisTemplate redis) {
        return (argv) -> {
            final var key = "tfh_l1";
            for (int i = 0; i < 60; i++) {
                final var op = redis.opsForList();
                op.rightPush(key, "i:" + i);
                redis.expire(key, 2, TimeUnit.MINUTES);
                Thread.sleep(1000);
            }
        };
    }
}
