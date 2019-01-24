/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.boot2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author tangfanghua
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String getName(Integer id) {
        return "你好 " + id;
    }

}
