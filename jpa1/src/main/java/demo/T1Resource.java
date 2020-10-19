package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/t1")
public class T1Resource {

    @Autowired
    T1Service t1Service;

    @PostMapping
    public T1 create() {
        T1 t1 = new T1();
        return t1;
    }

    @GetMapping
    //@Transactional
    public T1 get() {
//        t1Service.test(1);
        t1Service.test2(1);
        return null;
    }
}
