package cn.ken.service;

import cn.ken.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * User业务处理层
 * @author Administrator
 */
public interface IUserService {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    User selectByPrimaryKey(Integer id);

    List<User> selectAll();

    int updateByPrimaryKey(User record);}
