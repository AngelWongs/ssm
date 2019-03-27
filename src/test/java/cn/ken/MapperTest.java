package cn.ken;

import cn.ken.domain.User;
import cn.ken.mapper.UserMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MapperTest extends BaseTest {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void test(){
        List<User> users = userMapper.selectAll();
        users.forEach(user -> System.out.println(user));

    }
}
