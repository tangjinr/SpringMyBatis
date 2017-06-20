package com.tangz.springmybatis;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MybatisUserDao {

    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "firstName", column = "first_name"),
            @Result(property = "lastName", column = "last_name")}
    )
    @Select("select * from springjdbc_user where first_name=#{firstName}")
    public User getUser(String firstName);

    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "firstName", column = "first_name"),
            @Result(property = "lastName", column = "last_name")}
    )
    @Select("select * from springjdbc_user")
    public List<User> getUserList();
}
