package demo;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class T1ResourceTest {
    @Autowired
    T1Resource res;

    @org.junit.Test
    public void get() {
        res.get();
    }
}