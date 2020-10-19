package demo;

import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

public class App implements QuarkusApplication {
    @Override
    public int run(String... args) throws Exception {
        System.out.println("hello");
        return 0;
    }
}
