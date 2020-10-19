package demo;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "t1")
@Data
public class T1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String name;

}
