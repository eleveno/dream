package pro.xiaoyang.dream.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.xiaoyang.dream.base.User;

@RestController
@RequestMapping("/redis")
public class RedisHandler {
    @Autowired
    RedisTemplate<String, Object> redisTemplate;

    @RequestMapping("/save")
    public String saveToRedis(@RequestParam("key") String key, @RequestParam("value") String value) {
        redisTemplate.opsForValue().set(key, value);
        return key;
    }
    @RequestMapping("/read/{key}")
    public Object read(@PathVariable String key){
        return redisTemplate.opsForValue().get(key);
    }
 }
