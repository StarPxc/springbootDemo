package test.springboot.person.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import test.springboot.person.entity.Person;

/**
 * @author 浦希成 【pxc2955317305@outlook.com】
 * @Package test.springboot.person.dao
 * @date 2018/6/11  21:02
 * @Description: TODO
 */
public interface PersonDao extends JpaRepository<Person, Integer> {
}
