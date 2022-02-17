package pro.xiaoyang.dream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import pro.xiaoyang.dream.base.User;
import pro.xiaoyang.dream.service.UserService;

@SpringBootTest
class DreamApplicationTests {

    @Autowired
    RedisTemplate<String,Object> redisTemplate;

    @Autowired
    UserService userService;

    @Test
    public void redisStringTest(){
        redisTemplate.opsForValue().set("1","qq");
    }
    @Test
    public void redisObjectTest(){
        User user=userService.selectById(1);
        redisTemplate.opsForValue().set("2",user);
    }
}

