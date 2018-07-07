package test.springboot.user.entity;

import com.alibaba.fastjson.annotation.JSONField;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
public class User {
    @ApiModelProperty(hidden = true)//对swagger隐藏
    private Integer id;

    private String username;

    private String password;

    @ApiModelProperty(hidden = true)
    @JSONField(serialize = false)//不会被fastjson序列化
    private Date gmtCreate;

    @ApiModelProperty(hidden = true)
    @JSONField(serialize = false)
    private Date gmtUpdate;
}

