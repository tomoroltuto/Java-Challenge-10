package com.example.javafinalchallenge.infrastructure;

import com.example.javafinalchallenge.domain.model.User;
import java.util.List;
import java.util.Optional;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;


@Mapper
public interface UserMapper {

  @Select("select * from users")
  List<User> findAll();

  @Select("select * from users where id = #{id}")
  Optional<User> count(int id);

  @Insert("insert into users (name, email) values (#{name}, #{email})")
  void createUser(User user);

  @Update("update users set name=#{name},email=#{email} where id=#{id}")
  void updateUser(User user);

  @Delete("delete from users where id = #{id}")
  void deleteById(int id);
}
