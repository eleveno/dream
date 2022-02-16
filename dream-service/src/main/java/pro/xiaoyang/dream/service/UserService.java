package pro.xiaoyang.dream.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pro.xiaoyang.dream.base.User;
import pro.xiaoyang.dream.dao.mapper.UserMapper;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public User selectById(int id) {
        return userMapper.selectById(id);
    }

    public int save(User user){
       return userMapper.save(user);
    }
}
