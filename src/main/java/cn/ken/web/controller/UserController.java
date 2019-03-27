package cn.ken.web.controller;

import cn.ken.domain.User;
import cn.ken.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * User的Controller层
 * @author Administrator
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;
    @RequestMapping("/index")
    private void index(){

    }
    @RequestMapping("/list")
    @ResponseBody
    private List<User> list(){
        return userService.selectAll();
    }
}
