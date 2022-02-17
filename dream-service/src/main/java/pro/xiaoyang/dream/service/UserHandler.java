package pro.xiaoyang.dream.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pro.xiaoyang.dream.base.User;

@RestController
@RequestMapping("/user")
public class UserHandler {

    @Autowired
    private UserService userService;

    @RequestMapping("/getUser/{id}")
    public String getUser(@PathVariable int id) {
        return userService.selectById(id).toString();
    }

    @RequestMapping("/saveUser")
    public int save(@RequestBody User user){
        return userService.save(user);
    }
}
