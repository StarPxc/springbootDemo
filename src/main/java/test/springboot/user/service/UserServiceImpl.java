package test.springboot.user.service;

import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.springboot.common.enums.ResultEnum;
import test.springboot.common.execption.CustomException;
import test.springboot.user.entity.User;
import test.springboot.user.mapper.UserMapper;
import test.springboot.vo.QueryCondition;

import java.util.List;

/**
 * @author 浦希成 【pxc2955317305@outlook.com】
 * @Package test.springboot.user.service
 * @date 2018/6/10  12:15
 * @Description: TODO
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public User addUser(User user) {
        if (user == null) {
            throw new CustomException(ResultEnum.OBJECT_NULL_ERROR);
        }
        userMapper.insertSelective(user);
        return user;
    }

    @Override
    public User updateUser(User user) {
        if (user == null) {
            throw new CustomException(ResultEnum.OBJECT_NULL_ERROR);
        }
        userMapper.updateByPrimaryKeySelective(user);
        return user;
    }

    @Override
    public List<User> getUserCondition(QueryCondition queryCondition) {
        if (queryCondition == null) {
            throw new CustomException(ResultEnum.OBJECT_NULL_ERROR);
        }
        PageHelper.startPage(queryCondition.getPageNum(), queryCondition.getPageSize());

        return userMapper.selectAll();
    }
}
