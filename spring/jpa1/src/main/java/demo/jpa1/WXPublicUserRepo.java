package demo.jpa1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Set;

public interface WXPublicUserRepo extends JpaRepository<WXPublicUser, Integer> {


}
