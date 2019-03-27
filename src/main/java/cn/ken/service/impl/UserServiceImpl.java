package cn.ken.service.impl;

import cn.ken.domain.User;
import cn.ken.mapper.UserMapper;
import cn.ken.service.IUserService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Administrator
 */
@Service
//有事物支持事物,没有事物以非实物运行
//读的属性
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;

    /**
     * (propagation = Propagation.REQUIRED,readOnly =false)这是默认值
     */
    @Transactional
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    /**
     * 写
     * @param record
     * @return
     */
    @Transactional
    @Override
    public int insert(User record) {
        int insert = userMapper.insert(record);
        return insert;
    }

    @Override
    public User selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public List<User> selectAll() {
        /**
         * 参数1页数/参数21页展示的数据数
         */
        Page<User> objects = PageHelper.startPage(1, 10);
        List<User> users = userMapper.selectAll();
        return users;
    }

    @Transactional//写
    @Override
    public int updateByPrimaryKey(User record) {
        int i = userMapper.updateByPrimaryKey(record);
        return i;
    }
}
