package com.example.javafinalchallenge.infrastructure;

import com.example.javafinalchallenge.domain.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Optional;


@Mapper
public interface UserMapper {
    @Select("SELECT * FROM users")
    List<User> findAll();
    @Select("SELECT * FROM users WHERE id = #{id}")
    Optional<User> count(int id);
}
