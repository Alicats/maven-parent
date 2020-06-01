package cn.xej.mapper;

import cn.xej.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    public List<User> getUserList();
}
