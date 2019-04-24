package cn.ken;

import cn.ken.domain.User;
import cn.ken.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class MapperTest extends BaseTest {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void test(){
        List<User> users = userMapper.selectAll();
        users.forEach(user -> System.out.println(user));

    }
}
