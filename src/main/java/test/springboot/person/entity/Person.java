package test.springboot.person.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @author 浦希成 【pxc2955317305@outlook.com】
 * @Package test.springboot.person.entity
 * @date 2018/6/11  20:57
 * @Description: TODO
 */
@Data
@Entity(name = "person")
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String username;
    @Column
    private String password;
    @Column
    private Date birthday;
}
