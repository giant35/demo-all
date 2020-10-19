package demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class TestController {
    @PostMapping("/edi-order/order/create")
    public String ss(HttpServletRequest req, @RequestBody String str) {
        System.out.println("contentType:" + req.getContentType() + " \tstr:" + str);
        return "{\"status\":true}";
    }
}
