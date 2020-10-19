package demo;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UserService {
    public String getMsg(String name) {
        return "你好 " + name;
    }
}
