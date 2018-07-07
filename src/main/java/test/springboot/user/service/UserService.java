package test.springboot.user.service;


import test.springboot.user.entity.User;
import test.springboot.vo.QueryCondition;

import java.util.List;

/**
 * @author 浦希成 【pxc2955317305@outlook.com】
 * @Package test.springboot.user.service
 * @date 2018/6/10  12:10
 * @Description: TODO
 */
public interface UserService {

    User addUser(User user);

    User updateUser(User user);

    List<User> getUserCondition(QueryCondition queryCondition);
}
