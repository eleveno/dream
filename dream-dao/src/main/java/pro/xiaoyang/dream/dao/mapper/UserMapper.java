package pro.xiaoyang.dream.dao.mapper;

import org.springframework.stereotype.Repository;
import pro.xiaoyang.dream.base.User;

@Repository
public interface UserMapper {

    User selectById(int id);


}
