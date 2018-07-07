package test.springboot.person.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.springboot.person.dao.PersonDao;
import test.springboot.person.entity.Person;

import java.util.Date;

/**
 * @author 浦希成 【pxc2955317305@outlook.com】
 * @Package test.springboot.person.service
 * @date 2018/6/11  21:02
 * @Description: TODO
 */
@Service
public class PersonService {
    @Autowired
    private PersonDao personDao;

    public void createJpaPerson(String username, String password) {
        Person person = new Person();
        person.setUsername(username);
        person.setPassword(password);
        person.setBirthday(new Date());
        personDao.save(person);


    }
}
