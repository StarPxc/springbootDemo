package test.springboot.user.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import test.springboot.common.resp.ApiResult;
import test.springboot.common.utils.RestUtil;
import test.springboot.user.entity.User;
import test.springboot.user.service.UserService;
import test.springboot.vo.QueryCondition;

/**
 * @author 浦希成 【pxc2955317305@outlook.com】
 * @Package test.springboot.user.controller
 * @date 2018/6/10  12:16
 * @Description: TODO
 */
@RestController
@RequestMapping("/user")
@Api(value = "用户接口", description = "用户接口")
public class UserController {
    @Autowired
    private UserService userService;

    @ApiOperation(value = "添加用户", position = 1, notes = "test")
    @ApiImplicitParam(name = "user",value = "<h1>用户对象</h1><br>参数是用户名和密码",dataType = "User")
    @PostMapping("add-user")
    public ApiResult addUser(@RequestBody User user) {
        return RestUtil.success("查询成功", userService.addUser(user));
    }

    @PostMapping("update-user")
    public ApiResult updateUser(@RequestBody User user) {
        return RestUtil.success("查询成功", userService.updateUser(user));
    }

    @PostMapping("get-user-condition")
    public ApiResult getUserCondition(@RequestBody QueryCondition queryCondition) {
        return RestUtil.success("查询成功", userService.getUserCondition(queryCondition));
    }

}
