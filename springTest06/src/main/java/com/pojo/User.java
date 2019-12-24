package com.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component//@Component组件，等价于 <bean id="user" class="com.pojo.User"/>
@Data
@Scope("singleton")
public class User {
    //相当于<property name="name" value="zhangzhang"/>
    @Value("zhangzhang")
    private String name;
}
