package com.example.javafinalchallenge.infrastructure;

import com.example.javafinalchallenge.domain.model.User;
import java.util.List;
import java.util.Optional;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface UserMapper {

  @Select("SELECT * FROM users")
  List<User> findAll();

  @Select("SELECT * FROM users WHERE id = #{id}")
  Optional<User> count(int id);

  @Insert("insert into users (name, teacher) values (#{name}, #{teacher})")
  void saveUser(User user);
}
